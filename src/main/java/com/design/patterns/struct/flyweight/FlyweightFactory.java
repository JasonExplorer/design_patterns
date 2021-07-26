package com.design.patterns.struct.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    // 定义一个池容器
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    // 享元工厂
    public static  Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            flyweight = new ConcreteFlyweightA(extrinsic);
            pool.put(extrinsic, flyweight);
        }
        return flyweight;
    }
}
