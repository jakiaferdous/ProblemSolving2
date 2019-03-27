package com.company;
import java.util.HashMap;

/*Given a m * n matrix, if an element is 0, set its entire row and column to 0. Do it in
place.*/

public class SetMatrixZero {

    public static void setMatrixToZero(int[][] matrix) {

        HashMap<Integer, Boolean> col = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    col.put(j, true);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            boolean row = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row = true;
                    break;
                }
            }

            for (int j = 0; j < matrix[i].length; j++) {
                if (row || col.containsKey(j)) {
                    matrix[i][j] = 0;
                }
            }
        }


    }

    public static void main(String[] args) {

        int[][] matrix = {{9, 2, 3},
                {4, 5, 6},
                {7, 0, 9}};
        setMatrixToZero(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}

