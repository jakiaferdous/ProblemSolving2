package com.company;

public class IntegerToRoman {
    
    public static void main(String[] args) {
        String result = toRoman(2008);

        int result1 = toInteger("MCMXC");
        System.out.println(result1);
    }

    public static int toInteger(String s) {

        for (int i = 0; i < 3999; i++) {
            String result = toRoman(i);
            if (result.equals(s)) {
                return i;
            }
        }
        return 0;
    }

    public static String toRoman(int a) {

        String[] a1 = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] a10 = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] a100 = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] a1000 = {"", "M", "MM", "MMM"};

        String result = "";

        if (a >= 1000) {
            result += a1000[a / 1000];
            a = a % 1000;
        }

        if (a >= 100) {
            result += a100[a / 100];
            a = a % 100;
        }

        if (a >= 10) {
            result += a10[a / 10];
            a = a % 10;
        }

        if (a >= 1) {
            result += a1[a];
        }

        return result;

    }

}

