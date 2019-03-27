package com.company;

import java.util.HashMap;

/*Given a m * n matrix, if an element is 0, set its entire row and column to 0. Do it in
place.*/

public class SetMatrixZero {

    public static void setMatrixToZero(int[][] matrix) {

        HashMap<Integer, Boolean> col = new HashMap<>();
        HashMap<Integer, Boolean> row = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row.put(i, true);
                    col.put(j, true);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (row.containsKey(i) || col.containsKey(j)) {
                    matrix[i][j] = 0;
                }
            }
        }


    }


    void setZeros(int[][] matrix) {

        boolean rowHasZero = false;
        boolean colHasZero = false;

        // Check if first row has a zero
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                rowHasZero = true;
                break;
            }
        }

        // Check if first colum has a zero
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                colHasZero = true;
                break;
            }
        }
        // Check for zeros in the rest of the array
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }

            }
        }

        if (rowHasZero) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        if (colHasZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }

        }


    }



    public static void main(String[] args) {

        int[][] matrix = {{9, 2, 3},
                {4, 5, 6},
                {7, 0, 9}};

        SetMatrixZero smz = new SetMatrixZero();
        smz.setZeros(matrix);
        //setMatrixToZero(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}

