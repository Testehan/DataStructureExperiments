package com.testehan.recursion;

public class Factorial {

    public static void main(String[] args) {
        long n = 20;
        System.out.println(factorial(n));
    }

    private static long factorial(long n) {
        if (n<0){   // Unintentional case
            return - 1;
        }
        if (n==0){      // Base case
            return 1;
        } else {        // Find the recursive case
            return n * factorial(n-1);
        }
    }
}
