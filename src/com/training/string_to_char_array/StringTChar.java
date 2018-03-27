package com.training.string_to_char_array;

public class StringTChar {
    public static void main(String[] args) {
        //1. Convert String to Stream Char.
        String password = "password123";

        password.chars() //IntStream
                .mapToObj(x -> (char) x)//Stream<Character>
                .forEach(System.out::println);
    }
}
