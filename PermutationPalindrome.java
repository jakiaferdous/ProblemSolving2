package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/*Palindrome Permutation: Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations:"taco cat'; "atco cta'; etc.) */


public class PermutationPalindrome {


    boolean isPermutationOfPalindrome(String phrase) {

        if (phrase.length() < 2) {
            return true;
        }

        ArrayList<Character> c = new ArrayList<>();

        for (int i = 0; i < phrase.length(); i++) {

            char ch = phrase.charAt(i);
            if (c.contains(ch)) {
                int index = c.indexOf(ch);
                c.remove(index);
            } else {
                c.add(ch);
            }
        }

        if (phrase.length() % 2 == 0) {
            return c.size() == 0;
        }
        if (phrase.length() % 2 == 1) {
            return c.size() == 1;
        }

        return false;
    }

    boolean isPermutationOfPalindromeTwo(String phrase) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < phrase.length(); i++) {

            char ch = phrase.charAt(i);

            if (map.containsKey(ch)) {
                map.remove(ch);
            } else {
                map.put(ch, 1);
            }
        }

        if (phrase.length() % 2 == 0) {
            return map.size() == 0;
        }
        if (phrase.length() % 2 == 1) {
            return map.size() == 1;
        }

        return false;
    }

    public static void main(String[] args) {

        String str = "aabbc";
        PermutationPalindrome pp = new PermutationPalindrome();
        boolean result = pp.isPermutationOfPalindromeTwo(str);
        System.out.println(result);

    }
}
