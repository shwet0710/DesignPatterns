package org.example;

import org.example.Base.Coffee;
import org.example.Base.Mocha;
import org.example.Decorator.Decorator;
import org.example.Decorator.MilkDecorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Mocha();
        System.out.println(coffee.cost());
        System.out.println(coffee.desc());
        Decorator decorator = new MilkDecorator(coffee);
        System.out.println(decorator.cost());
        System.out.println(decorator.desc());
    }
}