package com.training.function_interfaces;

import com.training.lambda_exercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListMethodsJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Holf", 93),
                new Person("Tommy", "Wiseau", 19),
                new Person("Like", "Mike", 25),
                new Person("Cola", "Crlos", 52),
                new Person("Mantos", "Carlos", 10)
        );

        //Step 1 - sort list by last name
        Collections.sort(people, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));

        //Step 2 - Create a method that prints all elements in the list.
        //printConditionally(people, person -> true);
        performConditionally(people, person -> true, person -> System.out.println(person));

        //Step 3 - Create a method that prints all people that have last name beginning with 'c'.
    //    printLastNameBeginningWithC(people);
        System.out.println();
      //  printConditionally(people, person -> person.getLastName().startsWith("C"));
        performConditionally(people, person -> person.getLastName().startsWith("C"), person -> System.out.println(person));

        System.out.println();
        //printConditionally(people, person -> person.getFirstName().startsWith("C"));
        performConditionally(people, person -> person.getFirstName().startsWith("C"), person -> System.out.println(person.getFirstName()));
    }

/*    private static void printLastNameBeginningWithC(List<Person> people) {
        for(Person person : people){
            if(person.getLastName().startsWith("C")){
                System.out.println(person);
            }
        }
    }*/

  /*  private static void printConditionally(List<Person> people, Predicate<Person> condition) {
        for(Person person : people){
            if(condition.test(person)){
                System.out.println(person);
            }
        }
    }*/

    private static void performConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> perform) {
        for(Person person : people){
            if(condition.test(person)){
                perform.accept(person);
            }
        }
    }
}
