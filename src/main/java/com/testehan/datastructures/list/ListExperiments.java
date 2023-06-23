package com.testehan.datastructures.list;

import java.util.ArrayList;
import java.util.List;

public class ListExperiments {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("purple");

        System.out.println(colors);
        System.out.println(colors.contains("black"));
        System.out.println(colors.contains("red"));

        for (String color : colors)
            System.out.println(color);

        colors.forEach(System.out::println);


        unmodifiableList();
    }

    private static void unmodifiableList(){
        List<String> unmodifiableList = List.of("red","blue","yellow");
        System.out.println(unmodifiableList);
        unmodifiableList.add("black");  // throws exception because it is immutable
    }
}
