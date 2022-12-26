package com.java.program.designpatterns;

public class Singleton {

    public static void main(String[] args) {

        SingletonInstance obj = SingletonInstance.getSingletonInstance();

        System.out.println("Singleton object created from the pattern " + obj);

    }

}

class SingletonInstance {

    private static SingletonInstance singletonInstance = null;

    private SingletonInstance() {

    }

    public static SingletonInstance getSingletonInstance() {

        if (null == singletonInstance) {
            synchronized (SingletonInstance.class) {
                return new SingletonInstance();
            }
        } else {
            return singletonInstance;
        }
    }

}
