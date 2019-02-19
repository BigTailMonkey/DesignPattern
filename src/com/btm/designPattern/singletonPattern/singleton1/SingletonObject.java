package com.btm.designPattern.singletonPattern.singleton1;

/**
 * 只适合单线程，不推荐
 * 当两个线程同时运行到“ if (singletonObject == null){”这行代码时，会发
 * 生两个线程都检测到对象为空，都进行初始化，就打破了单例的性质
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
     * 多线程下不安全
     * @return
     */
    public static SingletonObject getSingletonObject(){
        if (singletonObject == null){
            singletonObject = new SingletonObject();
        }
        return singletonObject;
    }

    public void sayHi(){
        System.out.println("静态对象懒汉式单例，只适用于单线程，多线程下会出问题。");
    }
}
