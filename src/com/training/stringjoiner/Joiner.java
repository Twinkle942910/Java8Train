package com.training.stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Joiner {
    public static void main(String[] args) {
        //1 by delimiter.
        StringJoiner sj = new StringJoiner(",");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        System.out.println(sj.toString());

        //2 Join String by a delimiter and starting with a supplied prefix and ending with a supplied suffix.
        StringJoiner sj2 = new StringJoiner("/", "prefix-", "-suffix");
        sj2.add("2016");
        sj2.add("02");
        sj2.add("26");
        System.out.println(sj2.toString());

        //3 StringJoiner is used internally by static String.join().
        System.out.println(String.join("-", "2015", "10", "31"));

        //4 Join a List by a delimiter.
        List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
        System.out.println(String.join(", ", list));

        //5 Two Stream and Collectors.joining examples. Join List<String> example.
        List<String> list1 = Arrays.asList("java", "python", "nodejs", "ruby");
        System.out.println(list1.stream().map(x -> x).collect(Collectors.joining(" | ")));

        //6 Collectors Join List<Object> example.
        test();
    }

    static void test() {

        List<Game> list = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );

        System.out.println(list.stream().map(x -> x.getName())
                .collect(Collectors.joining(", ", "{", "}")));

    }
}

class Game {
    String name;
    int ranking;

    public Game(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
