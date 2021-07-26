package com.design.patterns.struct.decorator;

public class ConcreteDecorator1 extends Decorator{

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    // 定义自己的修饰方法
    public void method1() {

    }

    // 重写父类的方法
    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
