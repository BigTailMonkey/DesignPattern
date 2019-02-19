package com.btm.designPattern.abstractFactoryPattern.threeProductTwoFactory;

public class HPMic implements Mic {
    @Override
    public void create() {
        System.out.println("生产一个HP耳麦。");
    }
}
