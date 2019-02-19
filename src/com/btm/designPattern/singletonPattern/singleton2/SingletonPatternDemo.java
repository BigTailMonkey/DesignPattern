package com.btm.designPattern.singletonPattern.singleton2;

public class SingletonPatternDemo {

    public static void main(String[] args){
        SingletonObject singletonObject = SingletonObject.getSingletonObject();
        singletonObject.sayHi();
    }
}
