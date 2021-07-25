package com.design.patterns.create.simpleFactory;

public class Client {

    public static void main(String[] args) {
        Car aodi = new AodiFactory().createCar();
        aodi.run();
    }
}
