package com.design.patterns.action.observer;

import java.util.Vector;

public abstract class Subject {

    private Vector<Observer> observerVector = new Vector<>();

    public void addObserver(Observer observer) {
        observerVector.add(observer);
    }

    public void delObserver(Observer observer) {
        observerVector.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observerVector) {
            observer.update();
        }
    }
}
