/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.pegasys.teku.bls.impl.blst.swig;

public class p2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected p2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(p2 obj) {
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
        blstJNI.delete_p2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(fp2 value) {
    blstJNI.p2_x_set(swigCPtr, this, fp2.getCPtr(value), value);
  }

  public fp2 getX() {
    long cPtr = blstJNI.p2_x_get(swigCPtr, this);
    return (cPtr == 0) ? null : new fp2(cPtr, false);
  }

  public void setY(fp2 value) {
    blstJNI.p2_y_set(swigCPtr, this, fp2.getCPtr(value), value);
  }

  public fp2 getY() {
    long cPtr = blstJNI.p2_y_get(swigCPtr, this);
    return (cPtr == 0) ? null : new fp2(cPtr, false);
  }

  public void setZ(fp2 value) {
    blstJNI.p2_z_set(swigCPtr, this, fp2.getCPtr(value), value);
  }

  public fp2 getZ() {
    long cPtr = blstJNI.p2_z_get(swigCPtr, this);
    return (cPtr == 0) ? null : new fp2(cPtr, false);
  }

  public p2() {
    this(blstJNI.new_p2(), true);
  }

}
