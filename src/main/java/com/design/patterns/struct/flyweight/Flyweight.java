package com.design.patterns.struct.flyweight;

public abstract class Flyweight {

    // 内部状态
    private String instrinsic;

    // 外部状态
    protected final String extrinsic;

    // 要求享元角色必须接收外部状态
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate();

    public String getInstrinsic() {
        return instrinsic;
    }

    public void setInstrinsic(String instrinsic) {
        this.instrinsic = instrinsic;
    }
}
