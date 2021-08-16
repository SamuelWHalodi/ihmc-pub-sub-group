/**
 * Copyright 2017 Florida Institute for Human and Machine Cognition (IHMC)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
#include "nativeparticipantimpl.h"
#include "xmlprofilehelper.h"
#include <fastrtps/log/Log.h>

#include <fastrtps/Domain.h>
#include <fastrtps/attributes/ParticipantAttributes.h>

#include <fastrtps/rtps/builtin/data/WriterProxyData.h>
#include <fastrtps/rtps/builtin/data/ReaderProxyData.h>
#include <fastrtps/rtps/reader/StatefulReader.h>


using namespace us::ihmc::rtps::impl::fastRTPS;

NativeParticipantImpl::NativeParticipantImpl(int domainId, std::string qosName, std::string qosXML, NativeParticipantListener* listener) throw(FastRTPSException) :
    listener(listener),
    m_rtps_listener(this)
{


	try
	{
        part = DomainParticipantFactory::get_instance()->create_participant(domainId, PARTICIPANT_QOS_DEFAULT);
	}
	catch(const std::exception &e)
	{
		std::cerr << "[ERROR]" << e.what() << std::endl;
		throw FastRTPSException("Problem creating RTPSParticipant");
		return;
	}
	

    if(part == nullptr)
    {
        throw FastRTPSException("Problem creating RTPSParticipant");
        return;
    }

    logInfo(PARTICIPANT,"Guid: " << part->guid());
    CommonFunctions::guidcpy(part->guid(), &guid);


}

NativeParticipantImpl::~NativeParticipantImpl()
{
    DomainParticipantFactory::get_instance()->delete_participant(part);
}

int64_t NativeParticipantImpl::getGuidLow()
{
    return guid.primitive.low;
}

int64_t NativeParticipantImpl::getGuidHigh()
{
    return guid.primitive.high;
}

DomainParticipant* NativeParticipantImpl::getParticipant()
{
    return part;
}

void NativeParticipantImpl::registerType(std::string name, int32_t maximumDataSize, bool hasKey)
{
    // This functions adds registered types to a vector of shared ptrs, so they get destroyed when this class gets destructed
    TypeSupport custom_type_support(new RawTopicDataType(name, maximumDataSize, hasKey));
    custom_type_support.register_type(part);
    registeredTypes.push_back(custom_type_support);
}

//void NativeParticipantImpl::MyParticipantListener::onParticipantDiscovery(Participant *participant, ParticipantDiscoveryInfo &&info)
//{
//    if(this->mp_participantimpl->listener!=nullptr)
//    {
//        ParticipantProxyData proxy_data = info.info;

//        logInfo(PARTICIPANT,"Remote participant Guid: " << rtpsinfo.m_guid);
//        GuidUnion retGuid;
//        CommonFunctions::guidcpy(proxy_data.m_guid, &retGuid);

//        this->mp_participantimpl->listener->onParticipantDiscovery((int64_t)&proxy_data, retGuid.primitive.high, retGuid.primitive.low, info.status);
//    }
//}

//void NativeParticipantImpl::MyParticipantListener::onSubscriberDiscovery(Participant *participant, ReaderDiscoveryInfo &&info)
//{
//    const ReaderProxyData&  proxyData = info.info;

//    GuidUnion guid;
//    CommonFunctions::guidcpy(proxyData.guid(), &guid);
//    GuidUnion participantGuid;
//    CommonFunctions::guidcpy(proxyData.RTPSParticipantKey(), &participantGuid);

//    this->mp_participantimpl->listener->onSubscriberDiscovery(info.status, guid.primitive.high, guid.primitive.low, proxyData.m_expectsInlineQos,
//                                                              &proxyData.remote_locators(),
//                                                              participantGuid.primitive.high,
//                                                              participantGuid.primitive.low,
//                                                              proxyData.typeName().to_string(),
//                                                              proxyData.topicName().to_string(),
//                                                              proxyData.userDefinedId(),
//                                                              proxyData.topicKind(),
//                                                              &proxyData.m_qos);
//}

//void NativeParticipantImpl::MyParticipantListener::onPublisherDiscovery(Participant *participant, WriterDiscoveryInfo &&info)
//{

//    if(this->mp_participantimpl->listener!=nullptr)
//    {

//        const WriterProxyData& proxyData = info.info;
//        GuidUnion guid;
//        CommonFunctions::guidcpy(proxyData.guid(), &guid);
//        GuidUnion participantGuid;
//        CommonFunctions::guidcpy(proxyData.RTPSParticipantKey(), &participantGuid);


//        this->mp_participantimpl->listener->onPublisherDiscovery(info.status,
//                                                                 guid.primitive.high,
//                                                                 guid.primitive.low,
//                                                                 &proxyData.remote_locators(),
//                                                                 participantGuid.primitive.high,
//                                                                 participantGuid.primitive.low,
//                                                                 proxyData.typeName().to_string(),
//                                                                 proxyData.topicName().to_string(),
//                                                                 proxyData.userDefinedId(),
//                                                                 proxyData.typeMaxSerialized(),
//                                                                 proxyData.topicKind(),
//                                                                 &proxyData.m_qos);
//    }

//}


std::string NativeParticipantListener::getName(int64_t infoPtr)
{
    return ((ParticipantProxyData*) infoPtr)->m_participantName.to_string();
}
