package org.example.AbstractFactory;

import org.example.Factory.Pant;
import org.example.Factory.Shirt;
import org.example.Factory.WinterPant;
import org.example.Factory.WinterShirt;

public class WinterClothesFactory implements ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new WinterShirt();
    }

    @Override
    public Pant createPant() {
        return new WinterPant();
    }
}
