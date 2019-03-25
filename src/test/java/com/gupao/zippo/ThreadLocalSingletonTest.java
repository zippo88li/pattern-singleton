package com.gupao.zippo;

import com.gupao.zippo.pattern.threadlocal.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        ThreadLocalSingleton threadLocalSingleton= ThreadLocalSingleton.getInstance();
        System.out.println( threadLocalSingleton);
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1=new Thread(new ThreadExector());
        Thread t2=new Thread(new ThreadExector());
        t1.start();
        t2.start();



    }
}
