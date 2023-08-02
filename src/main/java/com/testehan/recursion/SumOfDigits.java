package com.testehan.recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        int n = -102222; // 0 because it is negative...

        System.out.println(sumOfDigits(n));
    }

    private static int sumOfDigits(int n) {
        if(n==0 || n<0){
            return 0;
        } else{
            return n%10 + sumOfDigits(n/10);
        }
    }
}
