package com.company;

/*String Rotation: Assume you have a method i5Substring which checks ifone word is a substring
of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
call to isSubstring (e.g., Uwaterbottleuis a rotation ofuerbottlewatU). */

public class StringRotation {

    public boolean isSubString(String s1s2, String s2) {

        int j = 0;

        for (int i = 0; i < s1s2.length(); i++) {
            if (s1s2.charAt(i) == s2.charAt(i)) {
                j++;
            }
        }
        return j == s2.length();
    }

    public boolean isRotation(String s1, String s2) {

        if(s2.length() == s1.length() && s1.length()> 2){
            String s1s2 = s1 + s2;
            return isSubString(s1s2,s2);

        }
        return false;



    }
}
