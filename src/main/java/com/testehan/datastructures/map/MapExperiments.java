package com.testehan.datastructures.map;

import java.util.HashMap;
import java.util.Map;

public class MapExperiments {
    public static void main(String[] args) {
        Map<Integer,String> persons = new HashMap<>();
        persons.put(1,"Alex");
        persons.put(2,"Maria");
        persons.put(3,"Dan");
        persons.put(4,"Tiffany");

        System.out.println(persons);
        System.out.println(persons.get(2));

        persons.forEach((k,v)-> System.out.println(k + " -- " + v));
    }
}
