package com.btm.designPattern.abstractFactoryPattern.threeProductTwoFactory;

public class DellFactory extends AbstractFactory {

    @Override
    public Mouse createMouse(){
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard(){
        return new DellKeyboard();
    }

    @Override
    public Mic createMic() {
        return new DellMic();
    }
}
