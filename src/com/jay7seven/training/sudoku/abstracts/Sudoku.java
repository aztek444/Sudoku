package com.jay7seven.training.sudoku.abstracts;


import com.jay7seven.training.sudoku.constants.Sector;

public interface Sudoku {
    int[][] getMatrix();

    int[] getRow(int rowId);

    int[] getColumn(int columnId);

    int[][] getSector(Sector sectorId);

    boolean isUniqueInColumn(int number, int columnId);

    boolean isUniqueInRow(int number, int rowId);

    boolean isUniqueInSector(int number, Sector sectorId);
}
