package org.example.Base;

public class Mocha implements Coffee {
    @Override
    public String desc() {
        return "Mocha coffee";
    }

    @Override
    public String cost() {
        return "cost is 50";
    }
}
