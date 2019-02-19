package com.btm.designPattern.singletonPattern.singleton5;

/**
 * 使用静态内部类实现单例模式
 * 无需加锁，效率高
 * 懒加载模式，使用时再实例化，不会产生内存空间浪费
 * 建议使用
 * 但是使用静态内部类无法传参进来
 */
public class SingletonObject {

    /**
     * 将构造函数私有化，类外部无法访问，就无法在类的外部进行实例化
     */
    private SingletonObject(){};

    /**
     * 静态内部类与外部类实例没有绑定关系，无论创建多少个外部类对象，都只会有一个静态内部类对象
     * 静态内部类在外部类被加载时并不会立即加载，这样可以节省空间
     */
    private static class SingletonHolder{
        private static SingletonObject singletonObject = new SingletonObject();
    }

    /**
     * 当getSingletonObject()方法第一次被调用时，才会
     * 去加载SingletonHandler类，才会去初始化singletonObject对象，而JVM对
     * 类的创建，针对于同一个类加载器本身就是线程安全的,同时一个类只会创建
     * 一次，不会创建多次
     * @return
     */
    public static SingletonObject getSingletonObject(){
        return SingletonHolder.singletonObject;
    }

    public void sayHi(){
        System.out.println("静态内部类实现单例，无锁，懒加载，建议使用");
    }
}
