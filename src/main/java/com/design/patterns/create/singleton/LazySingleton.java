package com.design.patterns.create.singleton;

/**
 * 懒汉式
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
    }
    public synchronized LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
