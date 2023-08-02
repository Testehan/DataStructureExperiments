package com.testehan.recursion;

public class ReverseString {

    public static void main(String[] args) {
        String s = "abcdef";

        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        if (s.isBlank()){
            return s;
        } else {
            return reverse(s.substring(1))+s.charAt(0);
        }
    }
}
