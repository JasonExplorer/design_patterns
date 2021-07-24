package com.design.patterns.create.singleton;

/**
 * 静态内部类
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {

    }
    public static class SingletonClassInstance {
        private static final InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public InnerClassSingleton getInstance() {
        return  SingletonClassInstance.singleton;
    }
}
