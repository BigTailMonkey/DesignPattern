package com.btm.designPattern.abstractFactoryPattern.threeProductTwoFactory;

public class HPKeyboard implements Keyboard {
    @Override
    public void create() {
        System.out.println("生产一个HP键盘");
    }
}
