package org.example.strategy;

public class CreditCard implements Payment {
    private int card;
    public CreditCard(int card) {
        this.card = card;
    }
    @Override
    public void pay(int amount) {
        System.out.println("paid from card number "+card+" a payment of "+amount);
    }
}
