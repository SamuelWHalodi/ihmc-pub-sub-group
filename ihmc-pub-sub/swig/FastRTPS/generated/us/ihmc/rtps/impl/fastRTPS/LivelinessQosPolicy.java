/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class LivelinessQosPolicy extends QosPolicy {
  private transient long swigCPtr;

  protected LivelinessQosPolicy(long cPtr, boolean cMemoryOwn) {
    super(FastRTPSJNI.LivelinessQosPolicy_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LivelinessQosPolicy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_LivelinessQosPolicy(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public LivelinessQosPolicy() {
    this(FastRTPSJNI.new_LivelinessQosPolicy(), true);
  }

  public boolean addToCDRMessage(SWIGTYPE_p_eprosima__fastrtps__rtps__CDRMessage_t msg) {
    return FastRTPSJNI.LivelinessQosPolicy_addToCDRMessage(swigCPtr, this, SWIGTYPE_p_eprosima__fastrtps__rtps__CDRMessage_t.getCPtr(msg));
  }

  public void setKind(LivelinessQosPolicyKind value) {
    FastRTPSJNI.LivelinessQosPolicy_kind_set(swigCPtr, this, value.swigValue());
  }

  public LivelinessQosPolicyKind getKind() {
    return LivelinessQosPolicyKind.swigToEnum(FastRTPSJNI.LivelinessQosPolicy_kind_get(swigCPtr, this));
  }

  public void setLease_duration(Time_t value) {
    FastRTPSJNI.LivelinessQosPolicy_lease_duration_set(swigCPtr, this, Time_t.getCPtr(value), value);
  }

  public Time_t getLease_duration() {
    long cPtr = FastRTPSJNI.LivelinessQosPolicy_lease_duration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Time_t(cPtr, false);
  }

  public void setAnnouncement_period(Time_t value) {
    FastRTPSJNI.LivelinessQosPolicy_announcement_period_set(swigCPtr, this, Time_t.getCPtr(value), value);
  }

  public Time_t getAnnouncement_period() {
    long cPtr = FastRTPSJNI.LivelinessQosPolicy_announcement_period_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Time_t(cPtr, false);
  }

}
