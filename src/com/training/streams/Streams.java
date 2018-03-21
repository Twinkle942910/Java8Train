package com.training.streams;

import com.training.lambda_exercise.Person;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Holf", 93),
                new Person("Tommy", "Wiseau", 19),
                new Person("Like", "Mike", 25),
                new Person("Cola", "Crlos", 52),
                new Person("Mantos", "Carlos", 10)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p-> System.out.println(p));

        long count = people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();

        long count1 = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();

        System.out.println(count);
        System.out.println(count1);
    }
}
