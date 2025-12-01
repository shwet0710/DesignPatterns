package org.example.AbstractFactory;

import org.example.Factory.Pant;
import org.example.Factory.Shirt;

public interface ClothesFactory {
    Shirt createShirt();
    Pant createPant();
}
