package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class Cell {
    private int value = 0;
    private final Set<Integer> possibleValues;

    public Cell(int value) {
        this.value = value;
        possibleValues = new HashSet<>();
        for (int i = 1; i<10;i++){
            possibleValues.add(i);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
