package com.effectivejava.chapter20.chapter19;

/**
 * Created by maskwang on 2017/8/27 0027.
 * 矩阵是否包含已知路线
 */
public class Solution {
    static int[][] mark;
    static int pathLength = 0;

    public static void main(String[] args) {
        System.out.println(hasPath(new char[][]{{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}},
                3,4,new char[]{'a','b','\0'}));
    }

    public static boolean hasPath(char[][] matrix, int rows, int cols, char[] str) {
        mark = new int[rows][cols];
        for (int i = 0; i < rows; i++) {  //賦值为0
            for (int j = 0; j < cols; j++)
                mark[i][j] = 0;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasCorePath(matrix, rows, cols, i, j, str))
                    return true;
            }
        }
        return false;
    }

    public static boolean hasCorePath(char[][] matrix, int rows, int cols, int row, int col, char[] str) {
        boolean hasPathMark=false;
        if(str[pathLength]=='\0')
            return true;
        if (col >= 0 && col < cols && row >= 0 && row < rows&&matrix[row][col]==str[pathLength]&&mark[row][col]==0) {
            mark[row][col]=1;
            pathLength++;
            hasPathMark= hasCorePath(matrix, rows, cols, row + 1, col, str) ||
                    hasCorePath(matrix, rows, cols, row - 1, col, str) ||
                    hasCorePath(matrix, rows, cols, row, col - 1, str) ||
                    hasCorePath(matrix, rows, cols, row, col + 1, str);
            if(hasPathMark==false){
                pathLength--;
                mark[row][col]=0;
            }
        }
            return hasPathMark;
    }

}
