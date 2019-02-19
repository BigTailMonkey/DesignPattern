package com.btm.designPattern.singletonPattern.singleton6;

/**
 * 枚举单例
 * 利用枚举类型无法反射生成以及自带序列化属性，避免了单例模式的反射破坏和序列化破坏
 */
public class SingletonObject {

    /**
     * 构造函数私有，避免外部类实例化本类对象
     */
    private SingletonObject(){};

    /**
     * 单元素的枚举类型已经成为实现Singleton的最佳方法
     */
    private enum SingletonHolder{
        singleton;
        private SingletonObject singletonObject = null;
        SingletonHolder(){
            singletonObject = new SingletonObject();
        }

        public SingletonObject getSingletonObject() {
            return singletonObject;
        }
    }

    public static SingletonObject getSingletonObject(){
        return SingletonHolder.singleton.getSingletonObject();
    }
}
