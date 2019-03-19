package com.company;

public class ImplimentStrSrtMethod {

    public int implimentStrStr(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return -1;
        }

        if (str1.length() < str2.length()) {
            return -1;
        }

        if (str1.length() == 0 || str2.length() == 0) {
            return -1;
        }

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int j = 0;
        int k = -1;

        for (int i = 0; i < s1.length; i++) {

            if ((s1.length - i >= s2.length - j) && (s2.length - j >= 1)) {

                if (s1[i] == s2[j]) {

                    if (j == 0) {
                        k = i;
                    }
                    j++;
                } else if (j != 0 && s1[i] != s2[j]) {

                    return k = -1;
                }
            }


        }
        if(j == s2.length) {
                return k;
        }

        return k;

    }

    public static void main(String[] args) {

        String s1 = "lhet";
        String s2 = "he";

        ImplimentStrSrtMethod str = new ImplimentStrSrtMethod();
        System.out.println(str.implimentStrStr(s1, s2));


    }
}
