/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class TopicAttributes {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TopicAttributes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TopicAttributes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_TopicAttributes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopicAttributes() {
    this(FastRTPSJNI.new_TopicAttributes__SWIG_0(), true);
  }

  public TopicAttributes(String name, String dataType, TopicKind_t tKind, TopicDiscoveryKind_t tDiscovery) {
    this(FastRTPSJNI.new_TopicAttributes__SWIG_1(name, dataType, tKind.swigValue(), tDiscovery.swigValue()), true);
  }

  public TopicAttributes(String name, String dataType, TopicKind_t tKind) {
    this(FastRTPSJNI.new_TopicAttributes__SWIG_2(name, dataType, tKind.swigValue()), true);
  }

  public TopicAttributes(String name, String dataType) {
    this(FastRTPSJNI.new_TopicAttributes__SWIG_3(name, dataType), true);
  }

  public void setTopicKind(TopicKind_t value) {
    FastRTPSJNI.TopicAttributes_topicKind_set(swigCPtr, this, value.swigValue());
  }

  public TopicKind_t getTopicKind() {
    return TopicKind_t.swigToEnum(FastRTPSJNI.TopicAttributes_topicKind_get(swigCPtr, this));
  }

  public void setTopicDiscoveryKind(TopicDiscoveryKind_t value) {
    FastRTPSJNI.TopicAttributes_topicDiscoveryKind_set(swigCPtr, this, value.swigValue());
  }

  public TopicDiscoveryKind_t getTopicDiscoveryKind() {
    return TopicDiscoveryKind_t.swigToEnum(FastRTPSJNI.TopicAttributes_topicDiscoveryKind_get(swigCPtr, this));
  }

  public void setTopicName(SWIGTYPE_p_string_255 value) {
    FastRTPSJNI.TopicAttributes_topicName_set(swigCPtr, this, SWIGTYPE_p_string_255.getCPtr(value));
  }

  public SWIGTYPE_p_string_255 getTopicName() {
    return new SWIGTYPE_p_string_255(FastRTPSJNI.TopicAttributes_topicName_get(swigCPtr, this), true);
  }

  public void setTopicDataType(SWIGTYPE_p_string_255 value) {
    FastRTPSJNI.TopicAttributes_topicDataType_set(swigCPtr, this, SWIGTYPE_p_string_255.getCPtr(value));
  }

  public SWIGTYPE_p_string_255 getTopicDataType() {
    return new SWIGTYPE_p_string_255(FastRTPSJNI.TopicAttributes_topicDataType_get(swigCPtr, this), true);
  }

  public void setHistoryQos(HistoryQosPolicy value) {
    FastRTPSJNI.TopicAttributes_historyQos_set(swigCPtr, this, HistoryQosPolicy.getCPtr(value), value);
  }

  public HistoryQosPolicy getHistoryQos() {
    long cPtr = FastRTPSJNI.TopicAttributes_historyQos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HistoryQosPolicy(cPtr, false);
  }

  public void setResourceLimitsQos(ResourceLimitsQosPolicy value) {
    FastRTPSJNI.TopicAttributes_resourceLimitsQos_set(swigCPtr, this, ResourceLimitsQosPolicy.getCPtr(value), value);
  }

  public ResourceLimitsQosPolicy getResourceLimitsQos() {
    long cPtr = FastRTPSJNI.TopicAttributes_resourceLimitsQos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ResourceLimitsQosPolicy(cPtr, false);
  }

  public void setDataRepresentationQos(DataRepresentationQosPolicy value) {
    FastRTPSJNI.TopicAttributes_dataRepresentationQos_set(swigCPtr, this, DataRepresentationQosPolicy.getCPtr(value), value);
  }

  public DataRepresentationQosPolicy getDataRepresentationQos() {
    long cPtr = FastRTPSJNI.TopicAttributes_dataRepresentationQos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DataRepresentationQosPolicy(cPtr, false);
  }

  public void setTypeConsistencyQos(TypeConsistencyEnforcementQosPolicy value) {
    FastRTPSJNI.TopicAttributes_typeConsistencyQos_set(swigCPtr, this, TypeConsistencyEnforcementQosPolicy.getCPtr(value), value);
  }

  public TypeConsistencyEnforcementQosPolicy getTypeConsistencyQos() {
    long cPtr = FastRTPSJNI.TopicAttributes_typeConsistencyQos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TypeConsistencyEnforcementQosPolicy(cPtr, false);
  }

  public void setType_id(TypeIdV1 value) {
    FastRTPSJNI.TopicAttributes_type_id_set(swigCPtr, this, TypeIdV1.getCPtr(value), value);
  }

  public TypeIdV1 getType_id() {
    long cPtr = FastRTPSJNI.TopicAttributes_type_id_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TypeIdV1(cPtr, false);
  }

  public void setType(TypeObjectV1 value) {
    FastRTPSJNI.TopicAttributes_type_set(swigCPtr, this, TypeObjectV1.getCPtr(value), value);
  }

  public TypeObjectV1 getType() {
    long cPtr = FastRTPSJNI.TopicAttributes_type_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TypeObjectV1(cPtr, false);
  }

  public boolean checkQos() {
    return FastRTPSJNI.TopicAttributes_checkQos(swigCPtr, this);
  }

}
