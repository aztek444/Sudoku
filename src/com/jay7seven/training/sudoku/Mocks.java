package com.jay7seven.training.sudoku;

import java.util.Arrays;

public class Mocks {

    public static final int[][] MATRIX = {{0, 3, 6, 9, 12, 15, 18, 21, 24},
            {1, 5, 9, 13, 17, 21, 26, 30, 32},
            {2, 7, 12, 17, 22, 27, 34, 39, 40},
            {3, 9, 15, 21, 27, 33, 42, 48, 48},
            {4, 11, 18, 25, 32, 39, 50, 57, 56},
            {5, 13, 21, 29, 37, 45, 58, 66, 64},
            {6, 15, 24, 33, 42, 51, 66, 75, 72},
            {7, 17, 27, 37, 47, 57, 74, 84, 80},
            {8, 19, 30, 41, 52, 63, 82, 93, 88}};

    public static int[][] getMatrix() {
        return MATRIX;
    }

    public static int[] getRow(int rowId) {
        return MATRIX[rowId];
    }

    public static int[] getColumn(int colId) {
        int[] column = new int[MATRIX[colId].length];
        for (int colIndex = 0; colIndex < column.length; colIndex++) {
            column[colIndex] = MATRIX[colIndex][colId];
        }

        return column;
    }


    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getRow(0)));
//        System.out.println(Arrays.hashCodegetColumn(0)));
    }
}
