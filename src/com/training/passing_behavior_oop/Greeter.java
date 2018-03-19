package com.training.passing_behavior_oop;

public class Greeter {

    public void greet(Greeting greeting){
       greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet(new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World");
            }
        });
    }
}
