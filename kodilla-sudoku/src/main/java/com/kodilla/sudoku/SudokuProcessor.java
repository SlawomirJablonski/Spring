package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuProcessor {
    public static void main(String[] args) {
        boolean gameFinished = false;

        //while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            //gameFinished = theGame.resolveSudoku();

        //}

        SudokuBoard sudokuBoard = new SudokuBoard();
        String[] myValues = {"234","345"};
        SudokuBoard newBoard = sudokuBoard.insertSudokuIssue(myValues);
        System.out.println(newBoard);
    }
}
