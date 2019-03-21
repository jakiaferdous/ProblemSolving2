package com.company;

import java.util.Arrays;

public class UniqueChar {

    public static void main(String[] args) {

        String s = "helo";
        System.out.println(isUnique(s));

    }

    public static boolean isUnique(String str) {

        if (str == null) {
            return false;
        }
        if (str.length() == 1) {
            return true;
        }

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                return false;
            }
        }
        return true;


    }


}
