package com.btm.designPattern.abstractFactoryPattern.twoProductThreeFactory;

public class AsusFactory extends AbstractFactory {

    @Override
    public Mouse createMouse() {
        return new AsusMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new AsusKeyboard();
    }
}
