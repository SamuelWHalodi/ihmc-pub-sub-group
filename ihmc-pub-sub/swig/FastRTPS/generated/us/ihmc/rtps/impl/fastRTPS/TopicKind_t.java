/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public final class TopicKind_t {
  public final static TopicKind_t NO_KEY = new TopicKind_t("NO_KEY");
  public final static TopicKind_t WITH_KEY = new TopicKind_t("WITH_KEY");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TopicKind_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TopicKind_t.class + " with value " + swigValue);
  }

  private TopicKind_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TopicKind_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TopicKind_t(String swigName, TopicKind_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TopicKind_t[] swigValues = { NO_KEY, WITH_KEY };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

