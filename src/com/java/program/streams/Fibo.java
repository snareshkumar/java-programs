package com.java.program.streams;

public class Fibo {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;

        int size = 10;
        System.out.println(n1 + " ");
        System.out.println(n2 + " ");
        for (int i = 2; i < size - 2; i++) {

            n3 = n1 + n2;
            System.out.println(n3 + " ");
            n1 = n2;
            n2 = n3;

        }
    }

}
