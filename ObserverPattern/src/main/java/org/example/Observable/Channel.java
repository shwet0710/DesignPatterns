package org.example.Observable;

import org.example.Observer.Subscribers;

public interface Channel {
    void addSubs(Subscribers s);
    void removeSubs(Subscribers s);
    void notifySubs();
}
