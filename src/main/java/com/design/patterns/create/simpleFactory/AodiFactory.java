package com.design.patterns.create.simpleFactory;

/**
 * 创建具体的工厂创建实例
 */
public class AodiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new AodiCar();
    }
}
