package com.training.match_examples;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MathcesExamples {
    public static void main(String[] args) {
        //Stream.of() for primitives and Arrays.stream() for objects.

        //1. Check if a String Array contains a certain value “A”. Java 8
        String[] alphabet = new String[]{"A", "B", "C"};
        // Convert to stream and test it
        boolean result = Arrays.stream(alphabet).anyMatch("A"::equals);
        if (result) {
            System.out.println("Hello A");
        }

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //2. Example to check if a String Array contains multiple values
        //Java 8
        boolean result1 = IntStream.of(number).anyMatch(x -> x == 4);

        if (result1) {
            System.out.println("Hello 4");
        } else {
            System.out.println("Where is number 4?");
        }

        long[] lNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean result2 = LongStream.of(lNumber).anyMatch(x -> x == 10);

        if (result2) {
            System.out.println("Hello 10");
        } else {
            System.out.println("Where is number 10?");
        }
    }
}
