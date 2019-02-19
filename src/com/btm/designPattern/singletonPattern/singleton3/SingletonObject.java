package com.btm.designPattern.singletonPattern.singleton3;
/**
 * 可以适用于多线程，效率适中，可以使用
 * 每次进入方法加锁前对实例对象判空，已经存在单例实例则直接返回。
 * 加锁后再次判空，防止在加锁期间单例已经被实例化，避免重复实例化。
 * 但由于JVM存在乱序执行的优化措施，产生DCL失效问题，所以也存在一定的多线程风险
 */
public class SingletonObject {
    /**
     * 持有一个自己的静态实例，静态变量在类的所有实例中是共享的
     */
    private static SingletonObject singletonObject = null;
    /**
     * JDK1.5及以后版本，使用volatile进行限制，可以避免DCL失效问题
     */
//    private volatile static SingletonObject singletonObject = null;
    /**
     * 将构造函数私有化，则当前类不允许在当前类外部进行初始化
     * 保证了这个类的实例只能在这个类内部进行实例化
     */
    private SingletonObject(){};
    /**
     * 每次进入方法加锁前对实例对象判空，已经存在单例实例则直接返回。
     * 加锁后再次判空，防止在加锁期间单例已经被实例化，避免重复实例化。
     * @return
     */
    public static SingletonObject getSingletonObject(){
        if (singletonObject == null){
            synchronized (SingletonObject.class){
                if (singletonObject == null){
                    singletonObject = new SingletonObject();
                }
            }
        }
        return singletonObject;
    }

    public void sayHi(){
        System.out.println("双重加锁懒汉式单例，多线程较为安全，可以使用。");
    }
}
