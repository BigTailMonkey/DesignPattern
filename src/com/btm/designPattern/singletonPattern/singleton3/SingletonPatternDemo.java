package com.btm.designPattern.singletonPattern.singleton3;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getSingletonObject();
        singletonObject.sayHi();
    }

}
