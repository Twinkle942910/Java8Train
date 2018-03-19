package com.training.passing_behavior_lambda;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public int doubleNumber(DoubleNumber doubleNumber, int a) {
        return doubleNumber.doubleNumber(a);
    }

    public double divideNumber(DivideNumber divideNumber, int a, int b) {
        return divideNumber.divide(a, b);
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet(() -> System.out.println("Hello World"));

        DoubleNumber doubleLambda = (int a) -> a * 2;

        System.out.println(greeter.doubleNumber(doubleLambda, 9));
        System.out.println(greeter.divideNumber((int a, int b) -> {
            if (b > 0) {
                return a / (double) b;
            } else {
                return 0;
            }
        }, 9, 18));
    }
}