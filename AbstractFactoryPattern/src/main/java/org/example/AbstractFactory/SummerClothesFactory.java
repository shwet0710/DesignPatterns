package org.example.AbstractFactory;

import org.example.Factory.Pant;
import org.example.Factory.Shirt;
import org.example.Factory.SummerPant;
import org.example.Factory.SummerShirt;

public class SummerClothesFactory implements ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new SummerShirt();
    }

    @Override
    public Pant createPant() {
        return new SummerPant();
    }
}
