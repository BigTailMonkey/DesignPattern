package com.btm.designPattern.singletonPattern.singleton5;

public class SingletonObjectDemo {

    public static void main(String[] args){
    SingletonObject singletonObject = SingletonObject.getSingletonObject();
    singletonObject.sayHi();
    }
}
