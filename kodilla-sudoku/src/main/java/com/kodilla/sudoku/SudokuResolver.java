package com.kodilla.sudoku;

public class SudokuResolver {

    private Cell[][] boardToSolve;

    public SudokuResolver(Cell[][] boardToSolve) {
        this.boardToSolve = boardToSolve;
    }

    //Solve method. Recursive BackTracking algorithm.
    public boolean solve() {
        SudokuConstraintsValidator validator = new SudokuConstraintsValidator(boardToSolve);
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                //searching empty cell
                if (boardToSolve[row][column].getValue() == 0) {
                    //try possible values
                    for (int number = 1; number <= 9; number++) {
                        //check sudoku constraints
                        if (validator.isSudokuRespect(row, column, number)) {
                            boardToSolve[row][column].setValue(number);

                            if (solve()) { //start backtracking recursively
                                return true;
                            } else { //if not a solution, empty the cell and continue
                                boardToSolve[row][column].setValue(0);
                            }
                        }
                    }

                    return false; //return false
                }
            }
        }

        return true; //sudoku solved
    }
}
