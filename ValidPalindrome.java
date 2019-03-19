package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class ValidPalindrome{

    public boolean validPalindrome(String str) {


        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (str.length() < 2) {
            return true;
        }
        int i = 0;
        int j = str.length() - 1;
        System.out.println(j);

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;


    }

    public boolean validPalindromeTwo(String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = str.length();

        if (len < 2) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        int i = 0;
        char[] array = str.toCharArray();


        while (i < (len / 2)) {
            stack.push(array[i]);
            i++;
        }

        if (len % 2 == 1) {
            i++;
        }

        while (i < len) {
            if(stack.pop() == array[i]){
                i++;
            }else {
               return false;
            }
        }

        return stack.isEmpty();


    }

    public static void main(String[] args) {

        String str = "Red rum, sir, is murder";

        ValidPalindrome v = new ValidPalindrome();

        System.out.println(v.validPalindromeTwo(str));


    }


}
