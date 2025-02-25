/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class LatencyBudgetQosPolicy extends QosPolicy {
  private transient long swigCPtr;

  protected LatencyBudgetQosPolicy(long cPtr, boolean cMemoryOwn) {
    super(FastRTPSJNI.LatencyBudgetQosPolicy_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LatencyBudgetQosPolicy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_LatencyBudgetQosPolicy(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public LatencyBudgetQosPolicy() {
    this(FastRTPSJNI.new_LatencyBudgetQosPolicy(), true);
  }

  public boolean addToCDRMessage(SWIGTYPE_p_eprosima__fastrtps__rtps__CDRMessage_t msg) {
    return FastRTPSJNI.LatencyBudgetQosPolicy_addToCDRMessage(swigCPtr, this, SWIGTYPE_p_eprosima__fastrtps__rtps__CDRMessage_t.getCPtr(msg));
  }

  public void setDuration(Time_t value) {
    FastRTPSJNI.LatencyBudgetQosPolicy_duration_set(swigCPtr, this, Time_t.getCPtr(value), value);
  }

  public Time_t getDuration() {
    long cPtr = FastRTPSJNI.LatencyBudgetQosPolicy_duration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Time_t(cPtr, false);
  }

}
