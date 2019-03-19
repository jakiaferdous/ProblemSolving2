package com.company;

public class LongestConsecutiveSequence {

    public int longestConsecutiveSequence(int[] a) {

        if (a.length == 0) {
            return 0;
        }

        int count = 0;
        int max = 0;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] + 1 == a[i + 1]) {
                count++;

                if (count + 1 > max) {
                    max = count + 1;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 5, 6, 7, 8};

        LongestConsecutiveSequence l = new LongestConsecutiveSequence();

        int count = l.longestConsecutiveSequence(a);
        System.out.println(count);


    }
}
