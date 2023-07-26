package com.testehan.recursion;

public class GreatestCommonDevisor {

    public static void main(String[] args) {
        int a = 8;
        int b = 12;

        System.out.println(gcd(a,b));
    }

    private static int gcd(int a, int b) {
        if (a<0 || b<0){    // in case negative numbers are provided, just return -1
            return -1;
        }
        if (b==0){
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
