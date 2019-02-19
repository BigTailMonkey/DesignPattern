package com.btm.designPattern.abstractFactoryPattern.twoProductTwoFactory;

public class DellMouse implements Mouse {
    @Override
    public void create() {
        System.out.println("生产一个DELL鼠标。");
    }
}
