package com.training.functional_interface;

public class Main {

    public static void sayHello(Hello hello){
        hello.hello();
    }

    public static void main(String[] args) {
        Hello helloLambda = () -> System.out.println("Hello");

        sayHello(helloLambda);
    }
}
