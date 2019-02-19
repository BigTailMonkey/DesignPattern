package com.btm.designPattern.abstractFactoryPattern.threeProductTwoFactory;

public class HPFacotry extends AbstractFactory {

    @Override
    public Keyboard createKeyboard() {
        return new HPKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new HPMouse();
    }

    @Override
    public Mic createMic() {
        return new HPMic();
    }
}
