package com.testehan.recursion;

public class RussianDolls {

    public static void openRussianDolls(int doll){
        if (doll == 1){ // base condition
            System.out.println(doll);
            System.out.println("All dolls are open");
        } else {
            System.out.println(doll);
            openRussianDolls(doll -1);
        }
    }

    public static void main(String[] args) {
        openRussianDolls(10);
    }
}
