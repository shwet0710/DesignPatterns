package org.example.Base;

public class Latte implements Coffee {
    @Override
    public String desc() {
        return "latte coffee";
    }

    @Override
    public String cost() {
        return "cost is 100";
    }
}
