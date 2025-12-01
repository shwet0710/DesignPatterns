package org.example.Decorator;

import org.example.Base.Coffee;

public class CreamDecorator extends Decorator {
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String desc() {
        return coffee.desc()+"added cream";
    }

    @Override
    public String cost() {
        return coffee.cost()+"cost to add is 40";
    }
}
