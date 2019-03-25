package com.gupao.zippo.pattern.lazy;

public class DoubleCheckLazySingleton {

    private volatile static DoubleCheckLazySingleton instance;

    private DoubleCheckLazySingleton() {
    }

    public static DoubleCheckLazySingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (null == instance) {
                    instance = new DoubleCheckLazySingleton();
                }
            }

        }
        return instance;
    }
}
