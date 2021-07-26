package com.design.patterns.struct.flyweight;

public class ConcreteFlyweightB extends Flyweight {

    // 接收外部状态
    public ConcreteFlyweightB(String extrinsic) {
        super(extrinsic);
    }

    // 根据外部状态进行逻辑处理
    @Override
    public void operate() {
        // 业务逻辑
    }
}
