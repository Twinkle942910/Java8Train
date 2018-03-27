package com.training.primitives_to_list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PTL {
    public static void main(String[] args) {
        //1. In Java 8, you can use the Stream APIs to do the boxing and conversion like this
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());
        System.out.println(list);
    }
}
