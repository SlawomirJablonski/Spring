package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuBoard {

    private ArrayList<SudokuRow> sudokuRows = new ArrayList<>();

    public SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            sudokuRows.add(new SudokuRow());
        }
    }

    public ArrayList<SudokuRow> getSudokuRows() {
        return sudokuRows;
    }

    public void setSudokuRows(ArrayList<SudokuRow> sudokuRows) {
        this.sudokuRows = sudokuRows;
    }

    public SudokuBoard insertSudokuIssue(String[] values){

        SudokuBoard board = new SudokuBoard();

        for(int i =0; i < values.length;i++){
            int x = Integer.parseInt(values[i].substring(0,1));
            int y = Integer.parseInt(values[i].substring(1,2));
            int value = Integer.parseInt(values[i].substring(2,3));

            SudokuElement sudokuElement = new SudokuElement(value);
            SudokuRow sudokuRow = new SudokuRow();
            sudokuRow.getSudokuElements().set(y,sudokuElement);
            board.sudokuRows.set(x,sudokuRow);
        }
        return board;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < 9; ++i) {
            if (i % 3 == 0) {
                result += " ==================================="+"\n";
            }
            if (i % 3 != 0) {
                result += " -----------------------------------"+"\n";
            }
            for (int j = 0; j < 9; ++j) {
                if (j % 3 == 0) {
                    result += "| ";
                }
                if (j % 3 != 0) {
                    result += "| ";
                }
                result += sudokuRows.get(i).getSudokuElements().get(j).getValue() == 0
                        ? " "
                        : Integer.toString(sudokuRows.get(i).getSudokuElements().get(j).getValue());

                result +=" ";
            }
            result +="|"+"\n";
        }
        result +=" ==================================="+"\n";

    return result;
    }
}

   /* Wyświetlanie planszy zrealizuj przy pomocy znaków | (pipe) oraz - (myślnik) dla ramek (jako metodę toString() klasy SudokuBoard).*/