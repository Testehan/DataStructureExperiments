package com.testehan.datastructures.set;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class SetExperiments {

    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();

        colors.add("red");
        colors.add("black");
        colors.add("blue");
        colors.add("red");  // not added

        System.out.println(colors);

        Set<Countries> countries = EnumSet.allOf(Countries.class);
        System.out.println(countries);
    }
}
