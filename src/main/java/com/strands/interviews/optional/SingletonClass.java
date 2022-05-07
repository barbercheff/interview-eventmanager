package com.strands.interviews.optional;

public class SingletonClass {
    private static SingletonClass instance = null;
    private String initialInfo = "Initial info";


    public SingletonClass()
    {

    }

    public static SingletonClass getInstance() {
        if(instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }

}
