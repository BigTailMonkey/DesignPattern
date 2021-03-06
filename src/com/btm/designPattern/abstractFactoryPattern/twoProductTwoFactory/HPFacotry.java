package com.btm.designPattern.abstractFactoryPattern.twoProductTwoFactory;

public class HPFacotry extends AbstractFactory {

    @Override
    public Keyboard createKeyboard() {
        return new HPKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new HPMouse();
    }
}
