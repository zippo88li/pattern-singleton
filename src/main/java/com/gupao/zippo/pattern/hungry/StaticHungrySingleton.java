package com.gupao.zippo.pattern.hungry;

public class StaticHungrySingleton {
    private static final StaticHungrySingleton instance;
    private StaticHungrySingleton() {
    }
    static {
        instance = new StaticHungrySingleton();

    }
    public static StaticHungrySingleton getInstance() {
        return instance;
    }
}
