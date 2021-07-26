package com.design.patterns.struct.bridge;

public class RefinedAbstraction extends Abstraction {

    // 重写构造函数
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    // 修正父类的行为
    @Override
    public void request() {
        // 业务逻辑处理
        super.request();
        super.getImplementor().doAnything();
    }
}
