package com.gupao.zippo;

public class LazySingletonTest {

    //懒汉式单例，延迟加载，线程安全测试
    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadExector() );
        Thread t2=new Thread(new ThreadExector() );
        t1.start();
        t2.start();

    }



}
