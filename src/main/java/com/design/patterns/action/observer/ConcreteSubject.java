package com.design.patterns.action.observer;

public class ConcreteSubject extends Subject {

    public void doSomething() {
        super.notifyAllObservers();
    }
}
