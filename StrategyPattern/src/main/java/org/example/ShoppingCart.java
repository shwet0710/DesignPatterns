package org.example;

import org.example.strategy.Payment;

public class ShoppingCart {
    Payment payment;
    public ShoppingCart(Payment payment) {
        this.payment = payment;
    }
    public void pay(int amount) {
        payment.pay(amount);
    }
}
