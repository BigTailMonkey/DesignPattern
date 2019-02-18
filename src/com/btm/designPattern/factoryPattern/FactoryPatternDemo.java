package com.btm.designPattern.factoryPattern;

public class FactoryPatternDemo {
    
    public static void main(String[] args){

        MouseFactory mouseFactory = new MouseFactory();
        Mouse mouse = mouseFactory.createMouse("DELL");
        mouse.create();
        mouse = mouseFactory.createMouse("HP");
        mouse.create();

    }
    
}
