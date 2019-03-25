package com.gupao.zippo.pattern.lazy;

/**
 * 懒汉式
 * 内部类的实现
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {

    }

    public static LazyInnerClassSingleton getInstance() {

        return lazy.lazyInnerClassSingleton;
    }


    public final static class lazy {
        private static final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();

    }

}
