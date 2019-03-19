package com.company;

import java.util.Arrays;

public class ZigZagConversion {

    public void zigZagConversion(int[] a) {

        int flag = 0;

        for (int i = 0; i < a.length -1 ; i++) {

            if (flag == 0) {
                if (a[i] > a[i + 1]) {

                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    flag = 1;
                }

            } else if (flag == 1) {
                    if (a[i] < a[i + 1]) {

                        int tmp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = tmp;
                        flag = 0;
                    }

            }

        }

    }

    public void swap(int x, int y) {

        int tmp = x;
        x = y;
        y = tmp;


    }

    public static void main(String[] args) {

        int[] a = {3, 1, 6};

        ZigZagConversion zc = new ZigZagConversion();

        zc.zigZagConversion(a);
        System.out.println(Arrays.toString(a));

    }
}
