package com.testehan.datastructures.array;

import java.util.Arrays;

public class Array2DExperiments {
    public static void main(String[] args) {
        char[][] board = new char[3][3];        // a 3x3 board

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                board[i][j] = '-';
            }
        }

        System.out.println(Arrays.deepToString(board));     // we need this toString method to print multi dimensional arrays

        board[0][0] = 'x';                  // O(m*n)
        board[1][0] = 'x';
        board[2][0] = 'x';

        System.out.println(Arrays.deepToString(board));

        String[][] stringMatrix = {{"a","b"},{"c","d"}};  // O(1)...so this is way more efficient to initialize..
        System.out.println(Arrays.deepToString(stringMatrix));
    }
}
