package com.gupao.zippo.pattern.register;

public enum  EnumSingleton {
    INSTANCE;
    private Object Data;


    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    public static EnumSingleton getInstance(){
        return  INSTANCE;
    }
}
