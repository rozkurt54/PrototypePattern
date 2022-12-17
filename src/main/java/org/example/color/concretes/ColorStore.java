package org.example.color.concretes;

import org.example.ProtoTypeDesignPattern.color.abstracts.Color;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {

  private Map<String, Color> colorMap = new HashMap<>();

  public void addColorToStore(Color color) {
    if (colorMap.keySet().contains(color.getColorName())) {
      throw new IllegalArgumentException("Color name already exist");
    }
    colorMap.put(color.getColorName(), color);
  }
  public void removeColorFromStore(Color color) {
    if(!colorMap.keySet().contains(color.getColorName())) {
      throw new IllegalArgumentException("Color name not found");
    }
    colorMap.remove(color);
  }

  public void listColors() {
    for (Color color : colorMap.values()) {
      System.out.println(color.getColorName());
    }
    }

    public Color getColor(String name) throws CloneNotSupportedException {
    if(name.isEmpty()) {
      return null;
    }
    if(!colorMap.keySet().contains(name)){
      throw new IllegalArgumentException("Color not found");
    }
    return colorMap.get(name).getClone();
    }


}


