package org.example;

import org.example.Observable.ContextObservable;
import org.example.Observer.EmailNotify;
import org.example.Observer.SmsNotify;
import org.example.Observer.Subscribers;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContextObservable contextObservable = new ContextObservable();
        Subscribers subs1 = new EmailNotify();
        Subscribers subs2 = new SmsNotify();
        contextObservable.addSubs(subs1);
        contextObservable.addSubs(subs2);
        contextObservable.uploadContent(3);
        contextObservable.uploadContent(4);
    }
}