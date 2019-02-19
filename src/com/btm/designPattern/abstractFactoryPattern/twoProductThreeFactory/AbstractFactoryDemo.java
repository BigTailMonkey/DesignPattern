package com.btm.designPattern.abstractFactoryPattern.twoProductThreeFactory;

public class AbstractFactoryDemo {


    public static void main(String[] args){

        AbstractFactory abstractFactory = null;
        Mouse mouse = null;
        Keyboard keyboard = null;

        System.out.println("使用DELL工厂：");
        abstractFactory = new DellFactory();
        mouse = abstractFactory.createMouse();
        keyboard = abstractFactory.createKeyboard();
        mouse.create();
        keyboard.create();

        System.out.println("\n使用HP工厂：");
        abstractFactory = new HPFacotry();
        mouse = abstractFactory.createMouse();
        keyboard = abstractFactory.createKeyboard();
        mouse.create();
        keyboard.create();

        System.out.println("\n使用ASUS工厂：");
        abstractFactory = new AsusFactory();
        mouse = abstractFactory.createMouse();
        keyboard = abstractFactory.createKeyboard();
        mouse.create();
        keyboard.create();

    }



}
