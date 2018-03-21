package com.training.method_references;

public class MethodReferences {
    public static void main(String[] args) {

        Thread t = new Thread(() -> printMessage());
        t.start();

        Thread t1 = new Thread(MethodReferences::printMessage);
        t1.start();
    }

    public static void printMessage(){
        System.out.println("Bye world");
    }
}
