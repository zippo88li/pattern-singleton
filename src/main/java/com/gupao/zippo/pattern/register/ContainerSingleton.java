package com.gupao.zippo.pattern.register;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private static Map<String, Object> map = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    public static Object getInstanse(String name) {
        synchronized (map) {
            Object obj = null;
            if (!map.containsKey(name)) {
                try {
                    obj = Class.forName(name);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                map.put(name, obj);
                return obj;
            } else {
                return map.get(name);
            }
        }

    }
}
