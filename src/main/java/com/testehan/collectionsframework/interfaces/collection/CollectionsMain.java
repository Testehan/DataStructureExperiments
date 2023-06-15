package com.testehan.collectionsframework.interfaces.collection;

// Collections is a nice utility class

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsMain {

    public static void main(String[] args) {
        Collection<String> someData= new ArrayList<>();

        someData.add("a");
        someData.add("b");
        someData.add("c");
        someData.add("dd");
        someData.add("e");
        someData.add("f");
        System.out.println(someData);

        Collections.reverse((List<String>)someData);
        System.out.println(someData);

        Collections.shuffle((List<String>)someData);
        System.out.println(someData);

        Collections.sort((List<String>)someData);
        System.out.println(someData);

        System.out.println(Collections.frequency(someData,"dd"));

        Collection<String> empty = Collections.emptyList();
//        empty.add(" "); // list returned by call from above is immutable...so this call fails
        System.out.println(empty);

    }
}
