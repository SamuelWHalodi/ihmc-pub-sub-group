/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class WriterDiscoveryInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected WriterDiscoveryInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(WriterDiscoveryInfo obj) {
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
        FastRTPSJNI.delete_WriterDiscoveryInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public final static class DISCOVERY_STATUS {
    public final static WriterDiscoveryInfo.DISCOVERY_STATUS DISCOVERED_WRITER = new WriterDiscoveryInfo.DISCOVERY_STATUS("DISCOVERED_WRITER");
    public final static WriterDiscoveryInfo.DISCOVERY_STATUS CHANGED_QOS_WRITER = new WriterDiscoveryInfo.DISCOVERY_STATUS("CHANGED_QOS_WRITER");
    public final static WriterDiscoveryInfo.DISCOVERY_STATUS REMOVED_WRITER = new WriterDiscoveryInfo.DISCOVERY_STATUS("REMOVED_WRITER");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static DISCOVERY_STATUS swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + DISCOVERY_STATUS.class + " with value " + swigValue);
    }

    private DISCOVERY_STATUS(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private DISCOVERY_STATUS(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private DISCOVERY_STATUS(String swigName, DISCOVERY_STATUS swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static DISCOVERY_STATUS[] swigValues = { DISCOVERED_WRITER, CHANGED_QOS_WRITER, REMOVED_WRITER };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
