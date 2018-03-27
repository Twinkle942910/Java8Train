package com.training.joining_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JA {
    public static void main(String[] args) {
        //1. Apache Commons Lang – ArrayUtils
        //The simplest way is add the Apache Commons Lang library, and use ArrayUtils. addAll to join arrays.
        // This method supports both primitive and object type arrays.

       /* String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};

        String[] result = ArrayUtils.addAll(s1, s2);

        System.out.println(Arrays.toString(result));

        int [] int1 = new int[]{1,2,3};
        int[] int2 = new int[]{4,5,6};

        int[] result2 = ArrayUtils.addAll(int1, int2);

        System.out.println(Arrays.toString(result2));*/

       //2. Java API
        //Pure Java API example, supports both primitive and generic types.

        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
        String[] s3 = new String[]{"g", "h", "i"};

        String[] result = joinArrayGeneric(s1, s2, s3);

        System.out.println(Arrays.toString(result));

        int[] int1 = new int[]{1, 2, 3};
        int[] int2 = new int[]{4, 5, 6};
        int[] int3 = new int[]{7, 8, 9};

        int[] result2 = joinArray(int1, int2, int3);

        System.out.println(Arrays.toString(result2));

        System.out.println();

        //3. Java 8 Stream example to join arrays.

        //join object type array
        String[] result1 = Stream.of(s1, s2, s3).flatMap(Stream::of).toArray(String[]::new);
        System.out.println(Arrays.toString(result1));

        int [] int12 = new int[]{1,2,3};
        int[] int22 = new int[]{4,5,6};
        int[] int32 = new int[]{7,8,9};

        //join 2 primitive type array
        int[] result23 = IntStream.concat(Arrays.stream(int12), Arrays.stream(int22)).toArray();

        //join 3 primitive type array, any better idea?
        int[] result3 = IntStream.concat(Arrays.stream(int12),
                IntStream.concat(Arrays.stream(int22), Arrays.stream(int32))).toArray();

        System.out.println(Arrays.toString(result23));

        System.out.println(Arrays.toString(result3));
    }

    static <T> T[] joinArrayGeneric(T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            length += array.length;
        }

        //T[] result = new T[length];
        final T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);

        int offset = 0;
        for (T[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        return result;
    }

    static int[] joinArray(int[]... arrays) {
        int length = 0;
        for (int[] array : arrays) {
            length += array.length;
        }

        final int[] result = new int[length];

        int offset = 0;
        for (int[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        return result;
    }
}
