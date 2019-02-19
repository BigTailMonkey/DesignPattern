package com.btm.designPattern.abstractFactoryPattern.threeProductTwoFactory;

public class DellMic implements Mic {
    @Override
    public void create() {
        System.out.println("生成一个DELL耳麦。");
    }
}
