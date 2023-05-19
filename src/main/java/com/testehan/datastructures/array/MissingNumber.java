package com.testehan.datastructures.array;

// find the missing number in an array of length n, with its elements going from 1....n

public class MissingNumber {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,9,10};   // 5 is missing
        System.out.println(missingNumber(numbers));

    }

    private static int missingNumber(int[] numbers) {
        int sum = 0;
        for (int i =0; i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        // because of the missing number our arrays length is n-1 not n...hence why we need to add +1 and +2 to the formula
        return ((numbers.length+1)*(numbers.length+2))/2 - sum;
    }

}
