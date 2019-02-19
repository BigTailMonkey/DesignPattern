package com.btm.designPattern.abstractFactoryPattern.twoProductThreeFactory;

public class AsusMouse implements Mouse {

    @Override
    public void create() {
        System.out.println("生成一个ASUS鼠标。");
    }
}
