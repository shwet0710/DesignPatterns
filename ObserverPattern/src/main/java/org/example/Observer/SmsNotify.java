package org.example.Observer;

public class SmsNotify implements Subscribers {
    @Override
    public void update(int cnt) {
        System.out.println("SMS sent");
    }
}
