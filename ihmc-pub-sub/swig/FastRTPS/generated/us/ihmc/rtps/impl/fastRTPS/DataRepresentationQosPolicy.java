/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class DataRepresentationQosPolicy extends QosPolicy {
  private transient long swigCPtr;

  protected DataRepresentationQosPolicy(long cPtr, boolean cMemoryOwn) {
    super(FastRTPSJNI.DataRepresentationQosPolicy_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataRepresentationQosPolicy obj) {
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
        FastRTPSJNI.delete_DataRepresentationQosPolicy(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setM_value(SWIGTYPE_p_std__vectorT_eprosima__fastrtps__DataRepresentationId_t value) {
    FastRTPSJNI.DataRepresentationQosPolicy_m_value_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_eprosima__fastrtps__DataRepresentationId_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_eprosima__fastrtps__DataRepresentationId_t getM_value() {
    long cPtr = FastRTPSJNI.DataRepresentationQosPolicy_m_value_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_eprosima__fastrtps__DataRepresentationId_t(cPtr, false);
  }

  public DataRepresentationQosPolicy() {
    this(FastRTPSJNI.new_DataRepresentationQosPolicy(), true);
  }

  public boolean addToCDRMessage(SWIGTYPE_p_eprosima__fastrtps__rtps__CDRMessage_t msg) {
    return FastRTPSJNI.DataRepresentationQosPolicy_addToCDRMessage(swigCPtr, this, SWIGTYPE_p_eprosima__fastrtps__rtps__CDRMessage_t.getCPtr(msg));
  }

}
