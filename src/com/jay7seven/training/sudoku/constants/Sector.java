package com.jay7seven.training.sudoku.constants;

public enum Sector {

    ONE(1, 1), TWO(1, 2), THREE(1, 3), FOUR(2, 1), FIVE(2, 2), SIX(2, 3), SEVEN(3, 1), EIGHT(3, 2), NINE(3, 3);

    private int sectorXiD;
    private int sectorYiD;

    Sector(int sectorId, int sectorYiD) {
        this.sectorXiD = sectorId;
        this.sectorYiD = sectorYiD;
    }

    public int getSectorXiD() {
        return sectorXiD;
    }

    public int getSectorYiD() {
        return sectorYiD;
    }
}
