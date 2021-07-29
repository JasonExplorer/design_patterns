package com.design.patterns.action.strategy;

public class Context {

    private Strategy strategy = null;
    public  Context (Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnyThing() {
        this.strategy.doSomething();
    }
}
