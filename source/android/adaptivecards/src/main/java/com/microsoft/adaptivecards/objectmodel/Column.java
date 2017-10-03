/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class Column extends BaseCardElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Column(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.Column_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Column obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_Column(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Column() {
    this(AdaptiveCardObjectModelJNI.new_Column__SWIG_0(), true);
  }

  public Column(Spacing spacing, boolean separation, String size, ContainerStyle style) {
    this(AdaptiveCardObjectModelJNI.new_Column__SWIG_1(spacing.swigValue(), separation, size, style.swigValue()), true);
  }

  public Column(Spacing spacing, boolean separation, String size, ContainerStyle style, BaseCardElementVector items) {
    this(AdaptiveCardObjectModelJNI.new_Column__SWIG_2(spacing.swigValue(), separation, size, style.swigValue(), BaseCardElementVector.getCPtr(items), items), true);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.Column_Serialize(swigCPtr, this);
  }

  public SWIGTYPE_p_Json__Value SerializeToJsonValue() {
    return new SWIGTYPE_p_Json__Value(AdaptiveCardObjectModelJNI.Column_SerializeToJsonValue(swigCPtr, this), true);
  }

  public static Column Deserialize(SWIGTYPE_p_Json__Value root) {
    long cPtr = AdaptiveCardObjectModelJNI.Column_Deserialize(SWIGTYPE_p_Json__Value.getCPtr(root));
    return (cPtr == 0) ? null : new Column(cPtr, true);
  }

  public static Column DeserializeFromString(String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.Column_DeserializeFromString(jsonString);
    return (cPtr == 0) ? null : new Column(cPtr, true);
  }

  public String GetWidth() {
    return AdaptiveCardObjectModelJNI.Column_GetWidth(swigCPtr, this);
  }

  public void SetWidth(String value) {
    AdaptiveCardObjectModelJNI.Column_SetWidth(swigCPtr, this, value);
  }

  public ContainerStyle GetStyle() {
    return ContainerStyle.swigToEnum(AdaptiveCardObjectModelJNI.Column_GetStyle(swigCPtr, this));
  }

  public void SetStyle(ContainerStyle value) {
    AdaptiveCardObjectModelJNI.Column_SetStyle(swigCPtr, this, value.swigValue());
  }

  public BaseCardElementVector GetItems() {
    return new BaseCardElementVector(AdaptiveCardObjectModelJNI.Column_GetItems__SWIG_0(swigCPtr, this), false);
  }

  public BaseActionElement GetSelectAction() {
    long cPtr = AdaptiveCardObjectModelJNI.Column_GetSelectAction(swigCPtr, this);
    return (cPtr == 0) ? null : new BaseActionElement(cPtr, true);
  }

  public void SetSelectAction(BaseActionElement action) {
    AdaptiveCardObjectModelJNI.Column_SetSelectAction(swigCPtr, this, BaseActionElement.getCPtr(action), action);
  }

  public static Column dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.Column_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new Column(cPtr, true);
  }

}
