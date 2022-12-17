package org.example.color.abstracts;

public abstract class Color {

  private String colorName;
  private String hexCode;
  private String rgbCode;
  private String cMYKCode;

  public String getColorName(){
    return colorName;
  }

  public String getHexCode(){
    return hexCode;
  }

  public String getRgbCode(){
    return rgbCode;
  };

  public String getcMYKCode(){
    return cMYKCode;
  }

  public abstract Color getClone() throws CloneNotSupportedException;


  public Color(String colorName, String hexCode, String rgbCode, String CMYKCode) {
    this.colorName = colorName;
    this.hexCode = hexCode;
    this.rgbCode = rgbCode;
    this.cMYKCode = CMYKCode;
  }


  @Override
  public String toString() {
    return "Color{" +
        "colorName='" + colorName + '\'' +
        ", hexCode='" + hexCode + '\'' +
        ", rgbCode='" + rgbCode + '\'' +
        ", cMYKCode='" + cMYKCode + '\'' +
        '}';
  }
}
