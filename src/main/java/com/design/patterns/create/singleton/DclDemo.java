package com.design.patterns.create.singleton;

/**
 * DCL双重检查模式
 */
public class DclDemo {
    private static DclDemo dclDemo;
    private DclDemo() {
    }
    public DclDemo getInstance() {
        if (dclDemo == null) {
            synchronized (DclDemo.class) {
                if (dclDemo == null) {
                    dclDemo = new DclDemo();
                }
            }
        }
        return dclDemo;
    }
}
