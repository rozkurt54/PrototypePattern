package org.example.color;

import org.example.color.abstracts.Color;
import org.example.color.concretes.ColorImpl;
import org.example.color.concretes.ColorStore;

public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {

    ColorStore colorStore = new ColorStore();
    Color primaryColor = new ColorImpl("PrimaryColor", "545465", "(255,255,255,0)", "24054554");
    Color secondaryColor = new ColorImpl("SecondaryColor", "3212221", "(100,100,100,20)", "231221");

    colorStore.addColorToStore(primaryColor);
    colorStore.addColorToStore(secondaryColor);



    Color pColor = colorStore.getColor("PrimaryColor");
    Color sColor = colorStore.getColor("SecondaryColor");

    System.out.println(sColor.getClone());


    System.out.println(pColor);
    System.out.println(sColor);

  }



}
