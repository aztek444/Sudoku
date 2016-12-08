package com.jay7seven.training.sudoku.impl;

import com.jay7seven.training.sudoku.Mocks;
import com.jay7seven.training.sudoku.abstracts.Sudoku;
import com.jay7seven.training.sudoku.constants.Sector;

import java.util.Random;

public class SudokuImp implements Sudoku {
    public static final int MATRIX_DIMEN_SIZE = 9;

        private final int[][] MATRIX = new int[MATRIX_DIMEN_SIZE][MATRIX_DIMEN_SIZE];
//    private final int[][] MATRIX = {{0, 3, 6, 9, 12, 15, 18, 21, 24},
//            {1, 5, 9, 13, 17, 21, 26, 30, 32},
//            {2, 7, 12, 17, 22, 27, 34, 39, 40},
//            {3, 9, 15, 21, 27, 33, 42, 48, 48},
//            {4, 11, 18, 25, 32, 39, 50, 57, 56},
//            {5, 13, 21, 29, 37, 45, 58, 66, 64},
//            {6, 15, 24, 33, 42, 51, 66, 75, 72},
//            {7, 17, 27, 37, 47, 57, 74, 84, 80},
//            {8, 19, 30, 41, 52, 63, 82, 93, 88}};


    private int getRandFromZeroToNine() {
        Random random = new Random();

        return random.nextInt(9) + 1;
    }

    @Override
    public int[][] getMatrix() {
        return MATRIX;
    }

    @Override
    public int[] getRow(int rowId) {
        return MATRIX[rowId];
    }

    @Override
    public int[] getColumn(int columnId) {
        int[] column = new int[MATRIX[columnId].length];
        for (int colIndex = 0; colIndex < column.length; colIndex++) {
            column[colIndex] = MATRIX[colIndex][columnId];
        }

        return column;
    }

    public static void main(String[] args) {
        SudokuImp sudokuImp = new SudokuImp();

        System.out.println(sudokuImp.isUniqueInSector(26, Sector.TWO));
    }

    @Override
    public int[][] getSector(Sector sector) {
        return generateSector(sector);
    }

    private int[][] generateSector(Sector sector) {
        int[][] sectorMatrix = new int[3][3];

        for (int x = (sector.getSectorXiD() - 1) * 3, row = 0; x < sector.getSectorXiD() * 3; x++, row++) {
            for (int y = (sector.getSectorYiD() - 1) * 3, col = 0; y < sector.getSectorYiD() * 3; y++, col++) {
                sectorMatrix[row][col] = MATRIX[x][y];
            }
        }

        return sectorMatrix;
    }

    @Override
    public boolean isUniqueInColumn(int number, int columnId) {

        return false;
    }

    @Override
    public boolean isUniqueInRow(int number, int rowId) {
        for (int col = 0; col < MATRIX[rowId].length; col++) {
            if(number == MATRIX[rowId][col]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean isUniqueInSector(int number, Sector sectorId) {
        for(int row = 0; row < generateSector(sectorId).length; row++) {
            for (int col = 0; col < generateSector(sectorId).length; col++) {
                if(generateSector(sectorId)[row][col] == number) {
                    return false;
                }
            }
        }

        return true;
    }


}
