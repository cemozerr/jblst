package tech.pegasys.teku.bls.impl.blst.swig;

/* This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class P2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected P2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(P2 obj) {
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
        blstJNI.delete_P2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public P2() {
    this(blstJNI.new_P2__SWIG_0(), true);
  }

  public P2(SecretKey sk) {
    this(blstJNI.new_P2__SWIG_1(SecretKey.getCPtr(sk), sk), true);
  }

  public P2(byte[] in) {
    this(blstJNI.new_P2__SWIG_2(in), true);
  }

  public P2(P2_Affine affine) {
    this(blstJNI.new_P2__SWIG_3(P2_Affine.getCPtr(affine), affine), true);
  }

  public P2 dup() {
    return new P2(blstJNI.P2_dup(swigCPtr, this), true);
  }

  public P2_Affine to_affine() {
    return new P2_Affine(blstJNI.P2_to_affine(swigCPtr, this), true);
  }

  public byte[] serialize() { return blstJNI.P2_serialize(swigCPtr, this); }

  public byte[] compress() { return blstJNI.P2_compress(swigCPtr, this); }

  public boolean on_curve() {
    return blstJNI.P2_on_curve(swigCPtr, this);
  }

  public boolean in_group() {
    return blstJNI.P2_in_group(swigCPtr, this);
  }

  public boolean is_inf() {
    return blstJNI.P2_is_inf(swigCPtr, this);
  }

  public boolean is_equal(P2 p) {
    return blstJNI.P2_is_equal(swigCPtr, this, P2.getCPtr(p), p);
  }

  public void aggregate(P2_Affine in) {
    blstJNI.P2_aggregate(swigCPtr, this, P2_Affine.getCPtr(in), in);
  }

  public P2 sign_with(SecretKey sk) { blstJNI.P2_sign_with(swigCPtr, this, SecretKey.getCPtr(sk), sk); return this; }

  public P2 hash_to(byte[] msg, String DST, byte[] aug) { blstJNI.P2_hash_to__SWIG_0(swigCPtr, this, msg, DST, aug); return this; }

  public P2 hash_to(byte[] msg, String DST) { blstJNI.P2_hash_to__SWIG_2(swigCPtr, this, msg, DST); return this; }

  public P2 hash_to(byte[] msg) { blstJNI.P2_hash_to__SWIG_3(swigCPtr, this, msg); return this; }

  public P2 encode_to(byte[] msg, String DST, byte[] aug) { blstJNI.P2_encode_to__SWIG_0(swigCPtr, this, msg, DST, aug); return this; }

  public P2 encode_to(byte[] msg, String DST) { blstJNI.P2_encode_to__SWIG_2(swigCPtr, this, msg, DST); return this; }

  public P2 encode_to(byte[] msg) { blstJNI.P2_encode_to__SWIG_3(swigCPtr, this, msg); return this; }

  public P2 mult(java.math.BigInteger scalar) { blstJNI.P2_mult(swigCPtr, this, scalar.toByteArray()); return this; }

  public P2 cneg(boolean flag) { blstJNI.P2_cneg(swigCPtr, this, flag); return this; }

  public P2 neg() { blstJNI.P2_neg(swigCPtr, this); return this; }

  public P2 add(P2 a) { blstJNI.P2_add__SWIG_0(swigCPtr, this, P2.getCPtr(a), a); return this; }

  public P2 add(P2_Affine a) { blstJNI.P2_add__SWIG_1(swigCPtr, this, P2_Affine.getCPtr(a), a); return this; }

  public P2 dbl() { blstJNI.P2_dbl(swigCPtr, this); return this; }

  public static P2 generator() {
    return new P2(blstJNI.P2_generator(), true);
  }

}