package com.btm.designPattern.singletonPattern.singleton2;
/**
 * 可以适用于多线程，但效率低
 * 对整个getSingletonObject方法加锁，每一个线程过来都要加锁。
 * 即使已经存在单例的实例，还要进行一遍加锁操作。
 */
public class SingletonObject {

    /**
     * 持有一个自己的静态实例，静态变量在类的所有实例中是共享的
     */
    private static SingletonObject singletonObject = null;

    /**
     * 将构造函数私有化，则当前类不允许在当前类外部进行初始化
     * 保证了这个类的实例只能在这个类内部进行实例化
     */
    private SingletonObject(){};

    /**
     * 每次进入方法都要加锁，即使已经存在单例的实例也要进行加锁操作，性能消耗大
     * @return
     */
    public static synchronized SingletonObject getSingletonObject(){
        if (singletonObject == null){
            singletonObject = new SingletonObject();
        }
        return singletonObject;
    }

    public void sayHi(){
        System.out.println("静态对象加锁懒汉式单例，多线程安全，但效率低。");
    }
}
