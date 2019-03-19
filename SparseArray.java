package com.company;

import java.util.Arrays;

public class SparseArray {
    static int[] matchingStrings(String[] strings, String[] queries) {

        int[] matchingStr = new int[queries.length];
        int count = 0;

        for(int  j = 0; j < strings.length; j++) {
            for (int i = 0; i < strings.length; i++) {
                if (queries[j].equals(strings[i]) ) {
                    count++;
                }

            }
            matchingStr[j] = count;
            count = 0;
        }
        return matchingStr;


    }


    public static void main(String[] args) {


        String[] array = {"ab","ab","abc"};
        String[] qaries = {"ab","abc","bc"};
        int []matchStr = matchingStrings(array,qaries);
        System.out.println(Arrays.toString(matchStr));

    }
}
