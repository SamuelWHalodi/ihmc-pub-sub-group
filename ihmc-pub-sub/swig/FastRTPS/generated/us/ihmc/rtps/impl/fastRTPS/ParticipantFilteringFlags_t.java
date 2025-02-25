/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public final class ParticipantFilteringFlags_t {
  public final static ParticipantFilteringFlags_t NO_FILTER = new ParticipantFilteringFlags_t("NO_FILTER", 0);
  public final static ParticipantFilteringFlags_t FILTER_DIFFERENT_HOST = new ParticipantFilteringFlags_t("FILTER_DIFFERENT_HOST", 0x1);
  public final static ParticipantFilteringFlags_t FILTER_DIFFERENT_PROCESS = new ParticipantFilteringFlags_t("FILTER_DIFFERENT_PROCESS", 0x2);
  public final static ParticipantFilteringFlags_t FILTER_SAME_PROCESS = new ParticipantFilteringFlags_t("FILTER_SAME_PROCESS", 0x4);

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ParticipantFilteringFlags_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ParticipantFilteringFlags_t.class + " with value " + swigValue);
  }

  private ParticipantFilteringFlags_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ParticipantFilteringFlags_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ParticipantFilteringFlags_t(String swigName, ParticipantFilteringFlags_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ParticipantFilteringFlags_t[] swigValues = { NO_FILTER, FILTER_DIFFERENT_HOST, FILTER_DIFFERENT_PROCESS, FILTER_SAME_PROCESS };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

