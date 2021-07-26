package com.design.patterns.struct.composite;

public class Client {
    public static void main(String[] args) {
        //创建根节点
        Composite root = new Composite();
        root.doSomething();
        // 树枝
        Composite branch = new Composite();
        // 叶子
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }

    // 递归
    public static void display(Composite root) {
        for (Component component : root.getChildren()) {
            if (component instanceof Leaf) {
                component.doSomething();
            } else {
                display((Composite) component);
            }
        }
    }
}
