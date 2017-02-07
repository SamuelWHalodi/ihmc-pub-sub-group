/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class TopicDataQosPolicy extends QosPolicy {
  private transient long swigCPtr;

  protected TopicDataQosPolicy(long cPtr, boolean cMemoryOwn) {
    super(FastRTPSJNI.TopicDataQosPolicy_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TopicDataQosPolicy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_TopicDataQosPolicy(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TopicDataQosPolicy() {
    this(FastRTPSJNI.new_TopicDataQosPolicy(), true);
  }

  public boolean addToCDRMessage(SWIGTYPE_p_CDRMessage_t msg) {
    return FastRTPSJNI.TopicDataQosPolicy_addToCDRMessage(swigCPtr, this, SWIGTYPE_p_CDRMessage_t.getCPtr(msg));
  }

  public void push_back(short oc) {
    FastRTPSJNI.TopicDataQosPolicy_push_back(swigCPtr, this, oc);
  }

  public void clear() {
    FastRTPSJNI.TopicDataQosPolicy_clear(swigCPtr, this);
  }

  public void setValue(octetVector ocv) {
    FastRTPSJNI.TopicDataQosPolicy_setValue(swigCPtr, this, octetVector.getCPtr(ocv), ocv);
  }

  public octetVector getValue() {
    return new octetVector(FastRTPSJNI.TopicDataQosPolicy_getValue(swigCPtr, this), true);
  }

}
