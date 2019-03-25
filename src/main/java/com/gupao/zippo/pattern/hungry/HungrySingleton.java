package com.gupao.zippo.pattern.hungry;

import com.sun.corba.se.spi.ior.ObjectKey;
import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;

//饿汉式单例
//类加载的时候就初始化，线程安全。
public class HungrySingleton implements Serializable {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        //防止反射破坏单例
        if (instance != null) {
            throw new RuntimeException("cant not init,已经实例化了");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    //防止反序列化
    //用自己的类替换，反序列化new出来的类，new出来的类会被gc回收
    public Object readResolve(){
        return  instance;
    }

}
