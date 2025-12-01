package org.example.Observable;

import org.example.Observer.Subscribers;

import java.util.ArrayList;
import java.util.List;

public class ContextObservable implements Channel {
    List<Subscribers> list = new ArrayList<>();
    int cnt;
    @Override
    public void addSubs(Subscribers s) {
        list.add(s);
    }

    @Override
    public void removeSubs(Subscribers s) {
        list.remove(s);
    }

    @Override
    public void notifySubs() {
        for(Subscribers subscribers:list) {
            subscribers.update(cnt);
        }
    }
    public void uploadContent(int count) {
        this.cnt = count;
        System.out.println("video uploaded");
        notifySubs();
    }
}
