package com.java.program.designpatterns;

public class Singleton {

    private static Singleton obj = null;

    private Singleton() {

    }

    public static Singleton getInstance() {

        if (obj == null) {
            return new Singleton();
        }
        return obj;

    }

    public static void main(String[] args) {

        Singleton object = getInstance();

        Singleton o = new Singleton();

    }

}
