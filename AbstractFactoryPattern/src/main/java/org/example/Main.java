package org.example;

import org.example.AbstractFactory.ClothesFactory;
import org.example.AbstractFactory.SummerClothesFactory;
import org.example.Factory.Pant;
import org.example.Factory.Shirt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClothesFactory clothesFactory = new SummerClothesFactory();
        Pant p = clothesFactory.createPant();
        Shirt s = clothesFactory.createShirt();
        p.wear();
        s.wear();
    }
}