/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.robclouth.art_nanovg.nanovg;

public class NVGparams {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NVGparams(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVGparams obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nanovgJNI.delete_NVGparams(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserPtr(SWIGTYPE_p_void value) {
    nanovgJNI.NVGparams_userPtr_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getUserPtr() {
    long cPtr = nanovgJNI.NVGparams_userPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setEdgeAntiAlias(int value) {
    nanovgJNI.NVGparams_edgeAntiAlias_set(swigCPtr, this, value);
  }

  public int getEdgeAntiAlias() {
    return nanovgJNI.NVGparams_edgeAntiAlias_get(swigCPtr, this);
  }

  public void setRenderCreate(SWIGTYPE_p_f_p_void__int value) {
    nanovgJNI.NVGparams_renderCreate_set(swigCPtr, this, SWIGTYPE_p_f_p_void__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void__int getRenderCreate() {
    long cPtr = nanovgJNI.NVGparams_renderCreate_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void__int(cPtr, false);
  }

  public void setRenderCreateTexture(SWIGTYPE_p_f_p_void_int_int_int_int_p_q_const__unsigned_char__int value) {
    nanovgJNI.NVGparams_renderCreateTexture_set(swigCPtr, this, SWIGTYPE_p_f_p_void_int_int_int_int_p_q_const__unsigned_char__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_int_int_int_int_p_q_const__unsigned_char__int getRenderCreateTexture() {
    long cPtr = nanovgJNI.NVGparams_renderCreateTexture_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_int_int_int_int_p_q_const__unsigned_char__int(cPtr, false);
  }

  public void setRenderDeleteTexture(SWIGTYPE_p_f_p_void_int__int value) {
    nanovgJNI.NVGparams_renderDeleteTexture_set(swigCPtr, this, SWIGTYPE_p_f_p_void_int__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_int__int getRenderDeleteTexture() {
    long cPtr = nanovgJNI.NVGparams_renderDeleteTexture_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_int__int(cPtr, false);
  }

  public void setRenderUpdateTexture(SWIGTYPE_p_f_p_void_int_int_int_int_int_p_q_const__unsigned_char__int value) {
    nanovgJNI.NVGparams_renderUpdateTexture_set(swigCPtr, this, SWIGTYPE_p_f_p_void_int_int_int_int_int_p_q_const__unsigned_char__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_int_int_int_int_int_p_q_const__unsigned_char__int getRenderUpdateTexture() {
    long cPtr = nanovgJNI.NVGparams_renderUpdateTexture_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_int_int_int_int_int_p_q_const__unsigned_char__int(cPtr, false);
  }

  public void setRenderGetTextureSize(SWIGTYPE_p_f_p_void_int_p_int_p_int__int value) {
    nanovgJNI.NVGparams_renderGetTextureSize_set(swigCPtr, this, SWIGTYPE_p_f_p_void_int_p_int_p_int__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_int_p_int_p_int__int getRenderGetTextureSize() {
    long cPtr = nanovgJNI.NVGparams_renderGetTextureSize_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_int_p_int_p_int__int(cPtr, false);
  }

  public void setRenderViewport(SWIGTYPE_p_f_p_void_int_int_float__void value) {
    nanovgJNI.NVGparams_renderViewport_set(swigCPtr, this, SWIGTYPE_p_f_p_void_int_int_float__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_int_int_float__void getRenderViewport() {
    long cPtr = nanovgJNI.NVGparams_renderViewport_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_int_int_float__void(cPtr, false);
  }

  public void setRenderCancel(SWIGTYPE_p_f_p_void__void value) {
    nanovgJNI.NVGparams_renderCancel_set(swigCPtr, this, SWIGTYPE_p_f_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void__void getRenderCancel() {
    long cPtr = nanovgJNI.NVGparams_renderCancel_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void__void(cPtr, false);
  }

  public void setRenderFlush(SWIGTYPE_p_f_p_void_struct_NVGcompositeOperationState__void value) {
    nanovgJNI.NVGparams_renderFlush_set(swigCPtr, this, SWIGTYPE_p_f_p_void_struct_NVGcompositeOperationState__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_struct_NVGcompositeOperationState__void getRenderFlush() {
    long cPtr = nanovgJNI.NVGparams_renderFlush_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_struct_NVGcompositeOperationState__void(cPtr, false);
  }

  public void setRenderFill(SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_float_p_q_const__float_p_q_const__struct_NVGpath_int__void value) {
    nanovgJNI.NVGparams_renderFill_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_float_p_q_const__float_p_q_const__struct_NVGpath_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_float_p_q_const__float_p_q_const__struct_NVGpath_int__void getRenderFill() {
    long cPtr = nanovgJNI.NVGparams_renderFill_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_float_p_q_const__float_p_q_const__struct_NVGpath_int__void(cPtr, false);
  }

  public void setRenderStroke(SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_float_float_p_q_const__struct_NVGpath_int__void value) {
    nanovgJNI.NVGparams_renderStroke_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_float_float_p_q_const__struct_NVGpath_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_float_float_p_q_const__struct_NVGpath_int__void getRenderStroke() {
    long cPtr = nanovgJNI.NVGparams_renderStroke_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_float_float_p_q_const__struct_NVGpath_int__void(cPtr, false);
  }

  public void setRenderTriangles(SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_p_q_const__struct_NVGvertex_int__void value) {
    nanovgJNI.NVGparams_renderTriangles_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_p_q_const__struct_NVGvertex_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_p_q_const__struct_NVGvertex_int__void getRenderTriangles() {
    long cPtr = nanovgJNI.NVGparams_renderTriangles_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_struct_NVGpaint_p_struct_NVGscissor_p_q_const__struct_NVGvertex_int__void(cPtr, false);
  }

  public void setRenderDelete(SWIGTYPE_p_f_p_void__void value) {
    nanovgJNI.NVGparams_renderDelete_set(swigCPtr, this, SWIGTYPE_p_f_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void__void getRenderDelete() {
    long cPtr = nanovgJNI.NVGparams_renderDelete_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void__void(cPtr, false);
  }

  public NVGparams() {
    this(nanovgJNI.new_NVGparams(), true);
  }

}
