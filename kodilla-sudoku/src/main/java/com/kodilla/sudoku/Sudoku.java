package com.kodilla.sudoku;

public class Sudoku {
    private int[][] board;
    private static String[] INPUT = {
            "0,1,2", "0,3,5", "0,5,1", "0,7,9",
            "1,0,8", "1,3,2", "1,5,3", "1,8,6",
            "2,1,3", "2,4,6", "2,7,7",
            "3,2,1", "3,6,6",
            "4,0,5", "4,1,4", "4,7,1", "4,8,9",
            "5,2,2", "5,6,7",
            "6,1,9", "6,4,3", "6,7,8",
            "7,0,2", "7,3,8", "7,5,4", "7,8,7",
            "8,1,1", "8,3,9", "8,5,7", "8,7,6"
    };

    public Sudoku(int[][] board) {
        this.board = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.board[i][j] = board[i][j];
            }
        }
    }

    //is already value in a row
    private boolean isValueInRow(int row, int value) {
        for (int i = 0; i < 9; i++)
            if (board[row][i] == value)
                return true;

        return false;
    }

    //is already value in a column
    private boolean isValueInCol(int column, int value) {
        for (int i = 0; i < 9; i++)
            if (board[i][column] == value)
                return true;

        return false;
    }

    //is already value in its 3x3 box
    private boolean isValueInBox(int row, int column, int number) {
        int r = row - row % 3;
        int c = column - column % 3;

        for (int i = r; i < r + 3; i++)
            for (int j = c; j < c + 3; j++)
                if (board[i][j] == number)
                    return true;

        return false;
    }

    //Sudoku constraints, check if the row, column, and 3x3 box are valid:
    private boolean isSudokuRespect(int row, int column, int number) {
        return !isValueInRow(row, number)  &&  !isValueInCol(column, number)  &&  !isValueInBox(row, column, number);
    }

    //Solve method. Recursive BackTracking algorithm.
    public boolean solve() {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                //searching empty cell
                if (board[row][column] == 0) {
                    //try possible values
                    for (int number = 1; number <= 9; number++) {
                        //check sudoku constraints
                        if (isSudokuRespect(row, column, number)) {
                            board[row][column] = number;

                            if (solve()) { // we start backtracking recursively
                                return true;
                            } else { // if not a solution, we empty the cell and we continue
                                board[row][column] = 0;
                            }
                        }
                    }

                    return false; // we return false
                }
            }
        }

        return true; // sudoku solved
    }

    public static void main(String[] args) {

        SudokuBoard sudokuBoard = new SudokuBoard();
        int[][] sudokuIssue = sudokuBoard.insertSudokuIssue(Sudoku.INPUT);
        Sudoku sudoku = new Sudoku(sudokuIssue);
        System.out.println("Sudoku case is:");
        sudokuBoard.writeSudoku(sudokuIssue);

        if (sudoku.solve()) {
            System.out.println("Sudoku solution");
            sudokuBoard.writeSudoku(sudoku.board);
        } else {
            System.out.println("Missing solution");
        }
    }
}