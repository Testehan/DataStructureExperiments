package com.testehan.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(calculateNthFibonacci(n));

        System.out.println("Printing first " + n + " Fibonacci numbers");
        for (int i=0;i<n;i++){
            System.out.println(calculateNthFibonacci(i));
        }
    }

    private static int calculateNthFibonacci(int n) {
        if (n<0){
            return -1;
        }
        if (n==0|| n==1){
            return n;
        } else {
            int lastNr =  calculateNthFibonacci(n-1) + calculateNthFibonacci(n-2);
            return lastNr;
        }
    }
}
