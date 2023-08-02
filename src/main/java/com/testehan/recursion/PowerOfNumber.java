package com.testehan.recursion;

public class PowerOfNumber {


    public static void main(String[] args) {
        int n = 3;
        int p = 4;

        System.out.println(powerOf(n,p));
    }

    private static int powerOf(int n, int p) {
        if (p<0){   // let's say that if negative power is given, it will return -1..
            return -1;
        }
        if (p==0){
            return 1;
        } else {
            return n * powerOf(n,p-1);
        }
    }
}
