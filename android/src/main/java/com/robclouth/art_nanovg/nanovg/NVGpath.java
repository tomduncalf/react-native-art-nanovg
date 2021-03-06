/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.robclouth.art_nanovg.nanovg;

public class NVGpath {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NVGpath(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVGpath obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nanovgJNI.delete_NVGpath(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFirst(int value) {
    nanovgJNI.NVGpath_first_set(swigCPtr, this, value);
  }

  public int getFirst() {
    return nanovgJNI.NVGpath_first_get(swigCPtr, this);
  }

  public void setCount(int value) {
    nanovgJNI.NVGpath_count_set(swigCPtr, this, value);
  }

  public int getCount() {
    return nanovgJNI.NVGpath_count_get(swigCPtr, this);
  }

  public void setClosed(short value) {
    nanovgJNI.NVGpath_closed_set(swigCPtr, this, value);
  }

  public short getClosed() {
    return nanovgJNI.NVGpath_closed_get(swigCPtr, this);
  }

  public void setNbevel(int value) {
    nanovgJNI.NVGpath_nbevel_set(swigCPtr, this, value);
  }

  public int getNbevel() {
    return nanovgJNI.NVGpath_nbevel_get(swigCPtr, this);
  }

  public void setFill(NVGvertex value) {
    nanovgJNI.NVGpath_fill_set(swigCPtr, this, NVGvertex.getCPtr(value), value);
  }

  public NVGvertex getFill() {
    long cPtr = nanovgJNI.NVGpath_fill_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVGvertex(cPtr, false);
  }

  public void setNfill(int value) {
    nanovgJNI.NVGpath_nfill_set(swigCPtr, this, value);
  }

  public int getNfill() {
    return nanovgJNI.NVGpath_nfill_get(swigCPtr, this);
  }

  public void setStroke(NVGvertex value) {
    nanovgJNI.NVGpath_stroke_set(swigCPtr, this, NVGvertex.getCPtr(value), value);
  }

  public NVGvertex getStroke() {
    long cPtr = nanovgJNI.NVGpath_stroke_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVGvertex(cPtr, false);
  }

  public void setNstroke(int value) {
    nanovgJNI.NVGpath_nstroke_set(swigCPtr, this, value);
  }

  public int getNstroke() {
    return nanovgJNI.NVGpath_nstroke_get(swigCPtr, this);
  }

  public void setWinding(int value) {
    nanovgJNI.NVGpath_winding_set(swigCPtr, this, value);
  }

  public int getWinding() {
    return nanovgJNI.NVGpath_winding_get(swigCPtr, this);
  }

  public void setConvex(int value) {
    nanovgJNI.NVGpath_convex_set(swigCPtr, this, value);
  }

  public int getConvex() {
    return nanovgJNI.NVGpath_convex_get(swigCPtr, this);
  }

  public NVGpath() {
    this(nanovgJNI.new_NVGpath(), true);
  }

}
