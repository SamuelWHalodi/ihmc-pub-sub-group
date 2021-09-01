/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class Locators extends LocatorsIterator {
  private transient long swigCPtr;

  protected Locators(long cPtr, boolean cMemoryOwn) {
    super(FastRTPSJNI.Locators_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Locators obj) {
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
        FastRTPSJNI.delete_Locators(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Locators(SWIGTYPE_p_std__vectorT_eprosima__fastrtps__rtps__Locator_t_t__const_iterator it) {
    this(FastRTPSJNI.new_Locators__SWIG_0(SWIGTYPE_p_std__vectorT_eprosima__fastrtps__rtps__Locator_t_t__const_iterator.getCPtr(it)), true);
  }

  public Locators(Locators other) {
    this(FastRTPSJNI.new_Locators__SWIG_1(Locators.getCPtr(other), other), true);
  }

  public Locator_t __ref__() {
    return new Locator_t(FastRTPSJNI.Locators___ref__(swigCPtr, this), false);
  }

}
