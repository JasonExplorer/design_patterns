package com.design.patterns.create.simpleFactory;

/**
 * 具体产品的工厂
 */
public class AodiCar implements Car{

    @Override
    public void run() {
        System.out.println("i am aodi car");
    }
}
