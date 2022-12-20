package com.java.program.streams;

import java.util.stream.LongStream;

public class Factorial {

    public static void main(String[] args) {

        // Traditional Way
        int factNumber = 5;
        int result = 1;
        if (factNumber == 1) {
            System.out.println("factorial value is " + factNumber);
        }
        for (int i = 1; i <= factNumber; i++) {
            result = result * i;
        }
        System.out.println("result value is " + result);

        // Using Java 8 Streams
        long streamResult = factorialUsingStream(factNumber);
        System.out.println("stream result values are " + streamResult);
    }

    public static long factorialUsingStream(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }

}
