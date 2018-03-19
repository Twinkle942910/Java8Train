package com.training.runnable_using_lambdas;

/**
 * We can use lambdas in the old legacy code.
 */
public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable.");
            }
        });

        myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("lambda Inside runnable"));
        myLambdaThread.run();
    }
}
