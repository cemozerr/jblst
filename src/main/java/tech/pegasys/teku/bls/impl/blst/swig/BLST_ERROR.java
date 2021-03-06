/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.pegasys.teku.bls.impl.blst.swig;

public final class BLST_ERROR {
  public final static BLST_ERROR BLST_SUCCESS = new BLST_ERROR("BLST_SUCCESS", blstJNI.BLST_SUCCESS_get());
  public final static BLST_ERROR BLST_BAD_ENCODING = new BLST_ERROR("BLST_BAD_ENCODING");
  public final static BLST_ERROR BLST_POINT_NOT_ON_CURVE = new BLST_ERROR("BLST_POINT_NOT_ON_CURVE");
  public final static BLST_ERROR BLST_POINT_NOT_IN_GROUP = new BLST_ERROR("BLST_POINT_NOT_IN_GROUP");
  public final static BLST_ERROR BLST_AGGR_TYPE_MISMATCH = new BLST_ERROR("BLST_AGGR_TYPE_MISMATCH");
  public final static BLST_ERROR BLST_VERIFY_FAIL = new BLST_ERROR("BLST_VERIFY_FAIL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BLST_ERROR swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BLST_ERROR.class + " with value " + swigValue);
  }

  private BLST_ERROR(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BLST_ERROR(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BLST_ERROR(String swigName, BLST_ERROR swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BLST_ERROR[] swigValues = { BLST_SUCCESS, BLST_BAD_ENCODING, BLST_POINT_NOT_ON_CURVE, BLST_POINT_NOT_IN_GROUP, BLST_AGGR_TYPE_MISMATCH, BLST_VERIFY_FAIL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

