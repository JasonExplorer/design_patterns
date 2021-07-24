package com.design.patterns.create.singleton;

/**
 * 饿汉式
 */
public class HungerSingleton {

    // 类初始化的时候立即加载该类
    private static HungerSingleton singleton = new HungerSingleton();

    private HungerSingleton() {

    }
    public static HungerSingleton getInstance() {
        return  singleton;
    }
}
