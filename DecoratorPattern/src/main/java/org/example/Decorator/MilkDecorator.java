package org.example.Decorator;

import org.example.Base.Coffee;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String desc() {
        return coffee.desc()+"added milk";
    }

    @Override
    public String cost() {
        return coffee.cost()+"add 25 for milk";
    }
}
