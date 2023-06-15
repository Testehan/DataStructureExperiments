package com.testehan.collectionsframework.implementations.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetMain {

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);

    }
}
