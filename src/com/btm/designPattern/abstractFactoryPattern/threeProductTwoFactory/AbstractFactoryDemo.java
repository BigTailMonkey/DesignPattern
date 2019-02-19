package com.btm.designPattern.abstractFactoryPattern.threeProductTwoFactory;

public class AbstractFactoryDemo {


    public static void main(String[] args){

        AbstractFactory abstractFactory = null;
        Mouse mouse = null;
        Keyboard keyboard = null;
        Mic mic = null;

        System.out.println("使用DELL工厂：");
        abstractFactory = new DellFactory();
        mouse = abstractFactory.createMouse();
        keyboard = abstractFactory.createKeyboard();
        mic = abstractFactory.createMic();
        mouse.create();
        keyboard.create();
        mic.create();

        System.out.println("\n使用HP工厂：");
        abstractFactory = new HPFacotry();
        mouse = abstractFactory.createMouse();
        keyboard = abstractFactory.createKeyboard();
        mic = abstractFactory.createMic();
        mouse.create();
        keyboard.create();
        mic.create();

    }



}
