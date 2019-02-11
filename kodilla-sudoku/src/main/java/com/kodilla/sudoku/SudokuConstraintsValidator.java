package com.kodilla.sudoku;

public class SudokuConstraintsValidator {

    private Cell[][] board;

    public SudokuConstraintsValidator(Cell[][] board) {
        this.board = board;
    }

    //is already value in a row
    private boolean isValueInRow(int row, int value) {
        for (int i = 0; i < 9; i++)
            //if (board[])
            if (board[row][i].getValue() == value)

                return true;

        return false;
    }

    //is already value in a column
    private boolean isValueInCol(int column, int value) {
        for (int i = 0; i < 9; i++)
            if (board[i][column].getValue() == value)
                return true;

        return false;
    }

    //is already value in its 3x3 box
    private boolean isValueInBox(int row, int column, int number) {
        int r = row - row % 3;
        int c = column - column % 3;

        for (int i = r; i < r + 3; i++)
            for (int j = c; j < c + 3; j++)
                if (board[i][j].getValue() == number)
                    return true;

        return false;
    }

    //Sudoku constraints, check if the row, column, and 3x3 box are valid:
    public boolean isSudokuRespect(int row, int column, int number) {
        return !isValueInRow(row, number)  &&  !isValueInCol(column, number)  &&  !isValueInBox(row, column, number);
    }
}
