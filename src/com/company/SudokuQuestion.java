package com.company;

import java.util.List;

public class SudokuQuestion {
    public static List<List<Integer>> findSolution(List<List<Integer>> board){
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

            }
        }
    }
    public static boolean validateRowAndCol(List<List<Integer>> bd, int r, int c, int input){
        // validate row
        if (bd.get(r).contains(input)) return false;
        for (int i=0; i<9; i++){
            if (bd.get(i).get(c) == input) return false;
        }
        return false;
    }

    public static boolean validateBlock(List<List<Integer>> bd, int r, int c, int input){
        int rRangeStart = 0;
        int cRangeStart = 0;
        int rRangeEnd = 0;
        int cRangeEnd = 0;
        rRangeStart = r/3*3;
        rRangeEnd = rRangeStart+3;
        cRangeStart = c/3*3;
        cRangeEnd = cRangeStart+3;
        for (int i = rRangeStart; i < rRangeEnd; i++) {
            for (int j = cRangeStart; j < cRangeEnd; j++) {
                if (bd.get(i).get(j) == input) return false;
            }
        }
        return true;
    }
}
