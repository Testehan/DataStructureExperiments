package com.testehan.datastructures.array;

// given an array find all pairs of numbers whose sum is equal to a number

public class PairsWhoseSumIsNumber {



    public static void main(String[] args) {
        int [] numbers = {2,6,3,9,11};
        int n = 9;

        printAllPairs(numbers,n);
    }

    private static void printAllPairs(int[] numbers, int n) {
        for (int i=0;i<numbers.length;i++){
            int sum = numbers[i];
            for (int j=i+1;j<numbers.length;j++){
                sum = sum + numbers[j];
                if (sum == n){
                    System.out.println("[" + numbers[i] + " " + numbers[j] + "]");
                }
            }
        }
    }
}
