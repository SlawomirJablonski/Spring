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

    public int[][] insertSudokuIssue(String[] quest) {
        int[][] sudokuSample = new int[9][9]; // default 0 vals
        for (int n = 0; n < quest.length; ++n) {
            int i = Integer.parseInt(quest[n].substring(0,1));
            int j = Integer.parseInt(quest[n].substring(2,3));
            int value = Integer.parseInt(quest[n].substring(4));
            sudokuSample[i][j] = value;
        }
        return sudokuSample;
    }

    //
    public void writeSudoku(int[][] solution){
        for (int i = 0; i < 9; ++i) {
            if (i % 3 == 0) {
                System.out.println(" ===================================");
            }
            if (i % 3 != 0){
                System.out.println(" -----------------------------------");
            }
            for (int j = 0; j < 9; ++j) {

                System.out.print("| ");

                System.out.print(solution[i][j] == 0
                        ? " "
                        : Integer.toString(solution[i][j]));

                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println(" ===================================");;
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

                result += "| ";

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