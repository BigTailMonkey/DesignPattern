package com.btm.designPattern.abstractFactoryPattern.threeProductTwoFactory;

public class DellKeyboard implements Keyboard {
    @Override
    public void create() {
        System.out.println("生产一个DELL键盘。");
    }
}
