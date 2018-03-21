package com.training.method_references;

import com.training.lambda_exercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferences2 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("John", "Holf", 93),
                new Person("Tommy", "Wiseau", 19),
                new Person("Like", "Mike", 25),
                new Person("Cola", "Crlos", 52),
                new Person("Mantos", "Carlos", 10)
        );

        //performConditionally(people, person -> true, person -> System.out.println(person));
        performConditionally(people, person -> true, System.out::println);
    }

    private static void performConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> perform) {
        for(Person person : people){
            if(condition.test(person)){
                perform.accept(person);
            }
        }
    }
}
