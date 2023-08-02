package com.testehan.collectionsframework.interfaces.list;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<String> someData= new ArrayList<>();

        someData.add("a");someData.add("x");someData.add("z");someData.add("m");
        someData.add("b");
        someData.add("c");
        someData.add("dd");
        someData.add("e");
        someData.add("f");

        someData.remove("e");
        System.out.println(someData);

        someData.removeIf(s -> s.length()>1);
        System.out.println(someData);

        System.out.println("Collection contains dd :" +someData.contains("dd"));

        System.out.println(someData.get(3));

        someData.sort((o1, o2) -> o1.compareTo(o2));
        someData.sort(String::compareTo);
        System.out.println(someData);
    }
}
