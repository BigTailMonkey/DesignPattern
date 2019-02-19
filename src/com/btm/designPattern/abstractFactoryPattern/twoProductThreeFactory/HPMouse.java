package com.btm.designPattern.abstractFactoryPattern.twoProductThreeFactory;

public class HPMouse implements Mouse {

    @Override
    public void create() {
        System.out.println("生产一个HP鼠标");
    }
}
