package com.testehan.datastructures.array;

import java.util.Arrays;

public class ArrayExperiments
{
    public static void main( String[] args )
    {
        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);

        int[] numbers = {1,3,4,0,2324,12};
        for (int i : numbers){
            System.out.println(i);
        }

        Arrays.stream(numbers).forEach(System.out::print);

        Arrays.sort(numbers);       // Arrays has lots of useful methods when dealing with Arrays..
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
