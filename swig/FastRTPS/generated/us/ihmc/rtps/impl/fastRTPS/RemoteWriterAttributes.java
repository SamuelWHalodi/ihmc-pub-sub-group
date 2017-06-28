/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class RemoteWriterAttributes {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RemoteWriterAttributes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RemoteWriterAttributes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_RemoteWriterAttributes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RemoteWriterAttributes() {
    this(FastRTPSJNI.new_RemoteWriterAttributes(), true);
  }

  public void setEndpoint(EndpointAttributes value) {
    FastRTPSJNI.RemoteWriterAttributes_endpoint_set(swigCPtr, this, EndpointAttributes.getCPtr(value), value);
  }

  public EndpointAttributes getEndpoint() {
    long cPtr = FastRTPSJNI.RemoteWriterAttributes_endpoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new EndpointAttributes(cPtr, false);
  }

  public void setLivelinessLeaseDuration(Time_t value) {
    FastRTPSJNI.RemoteWriterAttributes_livelinessLeaseDuration_set(swigCPtr, this, Time_t.getCPtr(value), value);
  }

  public Time_t getLivelinessLeaseDuration() {
    long cPtr = FastRTPSJNI.RemoteWriterAttributes_livelinessLeaseDuration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Time_t(cPtr, false);
  }

  public void setOwnershipStrength(int value) {
    FastRTPSJNI.RemoteWriterAttributes_ownershipStrength_set(swigCPtr, this, value);
  }

  public int getOwnershipStrength() {
    return FastRTPSJNI.RemoteWriterAttributes_ownershipStrength_get(swigCPtr, this);
  }

}
