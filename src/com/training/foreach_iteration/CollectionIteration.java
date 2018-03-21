package com.training.foreach_iteration;

import com.training.lambda_exercise.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIteration {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("John", "Holf", 93),
                new Person("Tommy", "Wiseau", 19),
                new Person("Like", "Mike", 25),
                new Person("Cola", "Crlos", 52),
                new Person("Mantos", "Carlos", 10)
        );

        /*External iterators*/
        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }

        System.out.println();

        for(Person person : people){
            System.out.println(person);
        }

        /*Internal iterator*/
        System.out.println();

        people.forEach((p) -> System.out.println(p));
    }
}
