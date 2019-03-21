package com.company;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String s1 = "God";
        String s2 = "dog";

    }

    public static boolean isPermutation(String s1,String s2){

        if(!s1.equals(s2)){
          return false;
        }

        s1 =sort(s1).toLowerCase();
        s2 =sort(s2).toLowerCase();

       return s1.equals(s2);


    }

    public static String sort(String str){

        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);
        return new String(charArray);

    }


}
