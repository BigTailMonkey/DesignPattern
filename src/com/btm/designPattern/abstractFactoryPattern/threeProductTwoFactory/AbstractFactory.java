package com.btm.designPattern.abstractFactoryPattern.threeProductTwoFactory;

abstract class AbstractFactory {

    public abstract Mouse createMouse();
    public abstract Keyboard createKeyboard();
    public abstract Mic createMic();

}
