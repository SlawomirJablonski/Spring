package com.kodilla.sudoku;

public class Sudoku {

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
    private Cell[][] boardWithCells;

    public Sudoku(Cell[][] boardWithCells) {
        this.boardWithCells = boardWithCells;
    }

    public static void main(String[] args) {

        SudokuBoard sudokuBoard = new SudokuBoard();
        Cell[][] sIssue = sudokuBoard.insertSudokuIssueToCells(Sudoku.INPUT);

        Sudoku sudoku = new Sudoku(sIssue);
        System.out.println("Sudoku case is:");
        sudokuBoard.writeSudokuWithCells(sIssue);

        SudokuResolver sudokuResolver = new SudokuResolver(sIssue);
        if(sudokuResolver.solve()){
            System.out.println("Sudoku solution");
            sudokuBoard.writeSudokuWithCells(sudoku.boardWithCells);
        }else {
            System.out.println("Missing solution");
        }
    }
}