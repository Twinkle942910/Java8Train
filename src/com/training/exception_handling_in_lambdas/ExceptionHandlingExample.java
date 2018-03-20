package com.training.exception_handling_in_lambdas;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4, 5};

        int key = 0;

        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] array, int key, BiConsumer<Integer, Integer> perform) {
        for(int number : array){
            perform.accept(number, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> perform){
        return (v, k) -> {
            try{
                perform.accept(v, k);
            }
            catch (ArithmeticException e){
                System.out.println("caught.");
            }
        };
    }
}
