package com.training.closures;

public class ClosuresExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        doProccess(10, new Proccess() {
            @Override
            public void proccess(int i) {
                System.out.println(i + b);
            }
        });

    }

    public static void doProccess(int i, Proccess proccess) {
        proccess.proccess(i);
    }

}

interface Proccess {
    void proccess(int i);
}
