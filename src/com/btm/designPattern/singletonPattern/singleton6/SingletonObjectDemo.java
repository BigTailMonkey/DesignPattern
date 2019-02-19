package com.btm.designPattern.singletonPattern.singleton6;

public class SingletonObjectDemo {

    public static void main(String[] args) throws InstantiationException,IllegalAccessException{
        SingletonObject s1 = SingletonObject.getSingletonObject();
        SingletonObject s2 = SingletonObject.getSingletonObject();
        System.out.println(s1 == s2);

    }
}
