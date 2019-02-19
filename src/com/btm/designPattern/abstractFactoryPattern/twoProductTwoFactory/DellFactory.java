package com.btm.designPattern.abstractFactoryPattern.twoProductTwoFactory;

public class DellFactory extends AbstractFactory {

    @Override
    public Mouse createMouse(){
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard(){
        return new DellKeyboard();
    }

}
