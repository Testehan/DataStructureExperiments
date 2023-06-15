package com.testehan.collectionsframework.interfaces.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMain {

    public static void main(String[] args) {
        Collection<String> someData= new ArrayList<>();

        someData.add("a");
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

        Collection<String> someData2= new ArrayList<>();
        someData2.add("b");
        someData2.add("c");

        someData.retainAll(someData2);
        System.out.println(someData);
    }
}
