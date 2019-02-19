package com.btm.designPattern.abstractFactoryPattern.twoProductThreeFactory;

public class AsusKeyboard implements Keyboard {

    @Override
    public void create() {
        System.out.println("生产一个ASUS键盘。");
    }
}
