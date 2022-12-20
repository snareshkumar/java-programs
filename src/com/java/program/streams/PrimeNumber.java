package com.java.program.streams;

import java.util.stream.IntStream;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        boolean flag = true;
        if (number < 2) {
            flag = false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        IntStream values = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        values.filter(n -> isPrime(n)).boxed().forEach(System.out::println);

    }

}
