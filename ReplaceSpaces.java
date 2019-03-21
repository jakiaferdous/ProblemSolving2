package com.company;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String str = "Hello World  ";
        String str2 = replaceString(str, 11);
        System.out.println(str2);

    }

    public static String replaceString(String str, int length) {

        char[] charArray = str.toCharArray();

        for (int i = length - 1, j = charArray.length - 1; i >= 0; i--, j--) {
            if (charArray[i] == ' ') {
                charArray[j] = '%';
                charArray[j - 1] = '0';
                charArray[j - 2] = '2';
                j -= 2;
            } else {
                charArray[j] = charArray[i];
            }
        }

        return new String(charArray);

    }


}
