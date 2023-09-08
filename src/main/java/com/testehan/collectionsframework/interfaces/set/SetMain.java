package com.testehan.collectionsframework.interfaces.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        basicCreation();

        creatingSetFromAnotherCollection();

        unionIntersectionDifference();
    }
    private static void basicCreation() {
        Set<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("grapes");
        fruits.add("lemon");
        fruits.add("grepfruit");
        System.out.println(fruits);

        for (String s : fruits){
            System.out.print(s + " ");
        }
        System.out.println( " ");
        fruits.stream().forEach(System.out::print);

        System.out.println( " ");
        fruits.forEach(s -> System.out.print(s + " "));

        System.out.println( " ");
        fruits.remove("apple");
        System.out.println(fruits);
    }

    private static void creatingSetFromAnotherCollection() {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers);

        Set<Integer> setNumbers = new HashSet<>(numbers);
        System.out.println(setNumbers);
    }

    private static void unionIntersectionDifference() {
        Set<Integer> nums1 = new HashSet<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        System.out.println(nums1);

        Set<Integer> nums2 = new HashSet<>();
        nums2.add(3);
        nums2.add(4);
        nums2.add(5);
        System.out.println(nums2);

        // union
        nums1.addAll(nums2);
        System.out.println(nums1);

        // intersection
        nums1.retainAll(nums2);
        System.out.println(nums1);

        // difference
        nums1.removeAll(nums2);
        System.out.println(nums1);
    }
}
