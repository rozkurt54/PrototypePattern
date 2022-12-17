package org.example.color.concretes;

import org.example.color.abstracts.Color;

public class ColorImpl extends Color implements Cloneable {


  public ColorImpl(String colorName, String hexCode, String rgbCode, String CMYKCode) {
    super(colorName, hexCode, rgbCode, CMYKCode);
  }

  @Override
  public ColorImpl getClone() throws CloneNotSupportedException {
    return (ColorImpl) this.clone();
  }
}
