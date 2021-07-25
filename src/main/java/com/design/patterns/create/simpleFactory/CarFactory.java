package com.design.patterns.create.simpleFactory;

/**
 * 核心工厂类不在负责所有产品的创建，而是交给子类去做
 */
public interface CarFactory {

    Car createCar();
}
