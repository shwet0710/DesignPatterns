package org.example.strategy;

public class UPI implements Payment {

    private int upiid;
    public UPI(int upiid) {
        this.upiid = upiid;
    }
    @Override
    public void pay(int amount) {
        System.out.println("paid from UPI "+upiid+" payment of "+amount);
    }
}
