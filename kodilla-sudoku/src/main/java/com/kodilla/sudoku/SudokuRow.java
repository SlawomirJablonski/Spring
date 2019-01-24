package com.kodilla.sudoku;
//
import java.util.ArrayList;

public class SudokuRow {

    private ArrayList<SudokuElement> sudokuElements = new ArrayList<>();

    public SudokuRow(){
        for (int i = 0; i<9;i++){
            sudokuElements.add(new SudokuElement(0));
        }
    }

    public ArrayList<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }
}