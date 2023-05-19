package com.testehan.datastructures.array;

// given an array find all pairs of numbers whose sum is equal to a number

public class MaxProductOfPair {



    public static void main(String[] args) {
        int [] numbers = {2,6,3,9,11};

        System.out.println(getMaxProduct(numbers));
    }

    private static int getMaxProduct(int[] numbers) {
        int maxProduct = 0;
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                int product = numbers[i] * numbers[j];
                if (product > maxProduct){
                    maxProduct = product;
                }
            }
        }

        return maxProduct;
    }
}
