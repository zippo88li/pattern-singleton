package com.gupao.zippo;

import com.gupao.zippo.pattern.hungry.HungrySingleton;
import com.gupao.zippo.pattern.lazy.LazySingleton;
import com.gupao.zippo.pattern.threadlocal.ThreadLocalSingleton;

public class ThreadExector implements Runnable {

    @Override
    public void run() {
        //线程安全，执行顺序问题
       // LazySingleton lazySingleton=LazySingleton.getInstance();
        //System.out.println(Thread.currentThread()+" :" +lazySingleton);


        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread()+":"+threadLocalSingleton);
        System.out.println(Thread.currentThread()+":"+ ThreadLocalSingleton.getInstance());

        System.out.println(Thread.currentThread()+":"+ ThreadLocalSingleton.getInstance());
    }
}
