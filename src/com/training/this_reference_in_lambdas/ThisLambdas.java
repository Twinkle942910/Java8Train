package com.training.this_reference_in_lambdas;

public class ThisLambdas {
    public static void main(String[] args) {
        ThisLambdas thisLambdas = new ThisLambdas();
        thisLambdas.doProccess(10, new Proccess() {
            @Override
            public void proccess(int i) {
                System.out.println("value of i is - " + i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "Inside";
            }
        });

        thisLambdas.doProccess(10, i -> {
            System.out.println("value of i is - " + i);
           /* System.out.println(this);*/ //Won't work.
        });

        thisLambdas.execute();
    }

    public void doProccess(int i, Proccess proccess) {
        proccess.proccess(i);
    }

    public void execute(){
        doProccess(10, i -> {
            System.out.println("value of i is - " + i);
             System.out.println(this); //Works, because it's not in a static context anymore (But for surrounding class. It does not override this like anonymous class).
        });
    }

    @Override
    public String toString() {
        return "ThisLambdas{}";
    }
}
