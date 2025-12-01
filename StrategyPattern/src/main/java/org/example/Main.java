package org.example;

import org.example.strategy.CreditCard;
import org.example.strategy.UPI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCard(1234));
        cart.pay(100);
        ShoppingCart cart1 = new ShoppingCart(new UPI(456));
        cart1.pay(50);
    }
}