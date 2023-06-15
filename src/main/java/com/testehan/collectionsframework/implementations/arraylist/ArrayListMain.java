package com.testehan.collectionsframework.implementations.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListMain {

    public static void main(String[] args) {
        creationAndVariousOperations();

        listIteratorExample();
    }

    private static void creationAndVariousOperations() {
        ArrayList<String> strings = new ArrayList<>(100);   // 10 is default
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        ArrayList<String> strings2 = new ArrayList<>(strings);
        strings.remove("b");

        System.out.println(strings);
        System.out.println(strings2);

        strings2.set(0,"x");

        strings.addAll(strings2);
        System.out.println(strings);

        ArrayList<String> strings3 = new ArrayList<>(100);   // 10 is default
        strings3.add("a");
        strings3.add("b");

        strings.removeAll(strings3);
        System.out.println(strings);
    }

    private static void listIteratorExample() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        ListIterator<String> listIterator = strings.listIterator();
        System.out.println("Forward direction");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        // this is the main advantage of ListIterator...it also provides methods to go backwards
        System.out.println("Backward direction");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
