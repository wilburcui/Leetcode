package com.company;

public class Q200 {
    public static int numIslands(char[][] grid) {
        int total = 0;
        if (grid.length==0) return 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                total += sink(i,j,grid);
            }
        }
        return total;
    }
    public static int sink(int i, int j, char[][] grid){
        int numRow = grid.length;
        int numCol = grid[0].length;
        if ( i<0 || i>=numRow || j<0 || j>=numCol || grid[i][j] != '1') return 0;
        grid[i][j] = '0';
        sink(i-1, j, grid);
        sink(i+1, j, grid);
        sink(i, j-1, grid);
        sink(i, j+1, grid);
        return 1;
    }
}
