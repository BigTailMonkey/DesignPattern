package com.btm.designPattern.factoryPattern;

public class MouseFactory {

    public Mouse createMouse(String mouseFactoryName){
        switch (mouseFactoryName){
            case "DELL":
                return new DellMouse();
            case "HP":
                return new HPMouse();
            default:
                return null;
        }
    }
}
