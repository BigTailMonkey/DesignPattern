package com.btm.designPattern.singletonPattern.singleton4;

/**
 * 饿汉式单例，推荐使用
 * 利用类的静态变量只会在类初始化创建一次的特性
 * 但在对象创建出来到真正使用的这段时间内可能会造成内存空间的浪费
 * 对象创建出来就是要使用的，不使用但又必须要创建的情况很少，
 * 而且这种方式不需要加锁，所以推荐使用这种方式
 */
public class SingletonObject {

    private static SingletonObject singletonObject = new SingletonObject();

    private SingletonObject(){};

    public static SingletonObject getSingletonObject(){
        return singletonObject;
    }
    public void sayHi(){
        System.out.println("饿汉式单例，无锁，效率高，推荐使用，但存在极小的浪费内存空间的可能性。");
    }
}
