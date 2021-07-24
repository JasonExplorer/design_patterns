package com.design.patterns.create;

/**
 * 抽象工厂类
 * 负责定义产品对象的产生
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
