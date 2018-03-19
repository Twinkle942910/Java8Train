package com.training.type_inference;

public class TypeInferenceExample {

    public static void main(String[] args) {
                                    //We can remove String as a type of argument.
        StringLengthLambda lambda = s -> s.length();

      //  System.out.println(lambda.stringLength("Hello"));
        printLambda(lambda);
    }

    public static void printLambda(StringLengthLambda lambda){
        System.out.println(lambda.stringLength("hello Lambda"));
    }

    interface StringLengthLambda {
        int stringLength(String string);
    }
}
