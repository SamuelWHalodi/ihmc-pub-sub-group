/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class DurabilityServiceQosPolicy extends QosPolicy {
  private transient long swigCPtr;

  protected DurabilityServiceQosPolicy(long cPtr, boolean cMemoryOwn) {
    super(FastRTPSJNI.DurabilityServiceQosPolicy_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DurabilityServiceQosPolicy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_DurabilityServiceQosPolicy(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setService_cleanup_delay(Time_t value) {
    FastRTPSJNI.DurabilityServiceQosPolicy_service_cleanup_delay_set(swigCPtr, this, Time_t.getCPtr(value), value);
  }

  public Time_t getService_cleanup_delay() {
    long cPtr = FastRTPSJNI.DurabilityServiceQosPolicy_service_cleanup_delay_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Time_t(cPtr, false);
  }

  public void setHistory_kind(HistoryQosPolicyKind value) {
    FastRTPSJNI.DurabilityServiceQosPolicy_history_kind_set(swigCPtr, this, value.swigValue());
  }

  public HistoryQosPolicyKind getHistory_kind() {
    return HistoryQosPolicyKind.swigToEnum(FastRTPSJNI.DurabilityServiceQosPolicy_history_kind_get(swigCPtr, this));
  }

  public void setHistory_depth(int value) {
    FastRTPSJNI.DurabilityServiceQosPolicy_history_depth_set(swigCPtr, this, value);
  }

  public int getHistory_depth() {
    return FastRTPSJNI.DurabilityServiceQosPolicy_history_depth_get(swigCPtr, this);
  }

  public void setMax_samples(int value) {
    FastRTPSJNI.DurabilityServiceQosPolicy_max_samples_set(swigCPtr, this, value);
  }

  public int getMax_samples() {
    return FastRTPSJNI.DurabilityServiceQosPolicy_max_samples_get(swigCPtr, this);
  }

  public void setMax_instances(int value) {
    FastRTPSJNI.DurabilityServiceQosPolicy_max_instances_set(swigCPtr, this, value);
  }

  public int getMax_instances() {
    return FastRTPSJNI.DurabilityServiceQosPolicy_max_instances_get(swigCPtr, this);
  }

  public void setMax_samples_per_instance(int value) {
    FastRTPSJNI.DurabilityServiceQosPolicy_max_samples_per_instance_set(swigCPtr, this, value);
  }

  public int getMax_samples_per_instance() {
    return FastRTPSJNI.DurabilityServiceQosPolicy_max_samples_per_instance_get(swigCPtr, this);
  }

  public DurabilityServiceQosPolicy() {
    this(FastRTPSJNI.new_DurabilityServiceQosPolicy(), true);
  }

  public boolean addToCDRMessage(SWIGTYPE_p_eprosima__fastrtps__rtps__CDRMessage_t msg) {
    return FastRTPSJNI.DurabilityServiceQosPolicy_addToCDRMessage(swigCPtr, this, SWIGTYPE_p_eprosima__fastrtps__rtps__CDRMessage_t.getCPtr(msg));
  }

}
