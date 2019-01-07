package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class SudokuElement {

    public static int EMPTY = -1;
    //private int value = SudokuElement.EMPTY;
    private int value;
    private Set<Integer> allowedValues = new HashSet<>();

    public SudokuElement(int value) {
        this.value = value;
    }

    /*public SudokuElement() {
        for (int i = 1; i<10;i++){
            allowedValues.add(i);
        }
    }*/

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(0>=value && value<=9){
            this.value = value;
            allowedValues.clear();
            allowedValues.add(value);
        }
    }

    public void removeValue(int value){
        allowedValues.remove(value);
    }
}
