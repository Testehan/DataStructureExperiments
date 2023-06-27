package com.testehan.recursion;

public class DecimalToBinary {


    public static void main(String[] args) {
        int decimanl = 9;

        System.out.println(binary(decimanl));
    }

    private static int binary(int n) {
        if (n<0){
            return -1;
        }
        if (n==0){
            return 0;
        } else {
            return n%2 + 10*binary(n/2);
        }
    }
}
