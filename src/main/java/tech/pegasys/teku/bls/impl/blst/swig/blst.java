package tech.pegasys.teku.bls.impl.blst.swig;
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

public class blst {
  public static P1 G1() {
    return new P1(blstJNI.G1(), true);
  }

  public static P2 G2() {
    return new P2(blstJNI.G2(), true);
  }

  public static P1_Affine getBLS12_381_G1() {
    long cPtr = blstJNI.BLS12_381_G1_get();
    return (cPtr == 0) ? null : new P1_Affine(cPtr, false);
  }

  public static P1_Affine getBLS12_381_NEG_G1() {
    long cPtr = blstJNI.BLS12_381_NEG_G1_get();
    return (cPtr == 0) ? null : new P1_Affine(cPtr, false);
  }

  public static P2_Affine getBLS12_381_G2() {
    long cPtr = blstJNI.BLS12_381_G2_get();
    return (cPtr == 0) ? null : new P2_Affine(cPtr, false);
  }

  public static P2_Affine getBLS12_381_NEG_G2() {
    long cPtr = blstJNI.BLS12_381_NEG_G2_get();
    return (cPtr == 0) ? null : new P2_Affine(cPtr, false);
  }

}