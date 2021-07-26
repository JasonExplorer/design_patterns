package com.design.patterns.struct.composite;

import java.util.ArrayList;

public class Composite extends Component {

    // 构件容器
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    // 增加叶子构件
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    // 删除叶子构件
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    // 返回树
    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
