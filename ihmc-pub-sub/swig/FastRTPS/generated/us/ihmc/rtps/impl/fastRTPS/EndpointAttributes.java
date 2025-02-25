/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class EndpointAttributes {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected EndpointAttributes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EndpointAttributes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_EndpointAttributes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEndpointKind(EndpointKind_t value) {
    FastRTPSJNI.EndpointAttributes_endpointKind_set(swigCPtr, this, value.swigValue());
  }

  public EndpointKind_t getEndpointKind() {
    return EndpointKind_t.swigToEnum(FastRTPSJNI.EndpointAttributes_endpointKind_get(swigCPtr, this));
  }

  public void setTopicKind(TopicKind_t value) {
    FastRTPSJNI.EndpointAttributes_topicKind_set(swigCPtr, this, value.swigValue());
  }

  public TopicKind_t getTopicKind() {
    return TopicKind_t.swigToEnum(FastRTPSJNI.EndpointAttributes_topicKind_get(swigCPtr, this));
  }

  public void setReliabilityKind(ReliabilityKind_t value) {
    FastRTPSJNI.EndpointAttributes_reliabilityKind_set(swigCPtr, this, value.swigValue());
  }

  public ReliabilityKind_t getReliabilityKind() {
    return ReliabilityKind_t.swigToEnum(FastRTPSJNI.EndpointAttributes_reliabilityKind_get(swigCPtr, this));
  }

  public void setDurabilityKind(DurabilityKind_t value) {
    FastRTPSJNI.EndpointAttributes_durabilityKind_set(swigCPtr, this, value.swigValue());
  }

  public DurabilityKind_t getDurabilityKind() {
    return DurabilityKind_t.swigToEnum(FastRTPSJNI.EndpointAttributes_durabilityKind_get(swigCPtr, this));
  }

  public void setPersistence_guid(SWIGTYPE_p_GUID_t value) {
    FastRTPSJNI.EndpointAttributes_persistence_guid_set(swigCPtr, this, SWIGTYPE_p_GUID_t.getCPtr(value));
  }

  public SWIGTYPE_p_GUID_t getPersistence_guid() {
    return new SWIGTYPE_p_GUID_t(FastRTPSJNI.EndpointAttributes_persistence_guid_get(swigCPtr, this), true);
  }

  public void setUnicastLocatorList(LocatorList_t value) {
    FastRTPSJNI.EndpointAttributes_unicastLocatorList_set(swigCPtr, this, LocatorList_t.getCPtr(value), value);
  }

  public LocatorList_t getUnicastLocatorList() {
    long cPtr = FastRTPSJNI.EndpointAttributes_unicastLocatorList_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LocatorList_t(cPtr, false);
  }

  public void setMulticastLocatorList(LocatorList_t value) {
    FastRTPSJNI.EndpointAttributes_multicastLocatorList_set(swigCPtr, this, LocatorList_t.getCPtr(value), value);
  }

  public LocatorList_t getMulticastLocatorList() {
    long cPtr = FastRTPSJNI.EndpointAttributes_multicastLocatorList_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LocatorList_t(cPtr, false);
  }

  public void setRemoteLocatorList(LocatorList_t value) {
    FastRTPSJNI.EndpointAttributes_remoteLocatorList_set(swigCPtr, this, LocatorList_t.getCPtr(value), value);
  }

  public LocatorList_t getRemoteLocatorList() {
    long cPtr = FastRTPSJNI.EndpointAttributes_remoteLocatorList_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LocatorList_t(cPtr, false);
  }

  public void setProperties(SWIGTYPE_p_PropertyPolicy value) {
    FastRTPSJNI.EndpointAttributes_properties_set(swigCPtr, this, SWIGTYPE_p_PropertyPolicy.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyPolicy getProperties() {
    return new SWIGTYPE_p_PropertyPolicy(FastRTPSJNI.EndpointAttributes_properties_get(swigCPtr, this), true);
  }

  public EndpointAttributes() {
    this(FastRTPSJNI.new_EndpointAttributes(), true);
  }

  public short getUserDefinedID() {
    return FastRTPSJNI.EndpointAttributes_getUserDefinedID(swigCPtr, this);
  }

  public short getEntityID() {
    return FastRTPSJNI.EndpointAttributes_getEntityID(swigCPtr, this);
  }

  public void setUserDefinedID(short id) {
    FastRTPSJNI.EndpointAttributes_setUserDefinedID(swigCPtr, this, id);
  }

  public void setEntityID(short id) {
    FastRTPSJNI.EndpointAttributes_setEntityID(swigCPtr, this, id);
  }

}
