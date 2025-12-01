package org.example.Decorator;

import org.example.Base.Coffee;

public abstract class Decorator implements Coffee {
    Coffee coffee;
    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
