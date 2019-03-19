package com.company;

public class SearchInsertPosition {

    public int searchInsertPosition(int[] a, int k) {

        int index = 0;
        if (k > a[a.length - 1]) {
            return a.length;
        } else if (k < a[0]) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] == k) {
                index = i;
            } else if ((k > a[i]) && (k < a[i + 1])) {
                index = i + 1;
            }
        }
        return index;

    }

    public int searchInsertPositionTwo(int[] a, int k) {

        int start = 0;
        int end = a.length - 1;

        while (start + 1 < end) {

            int mid = (end + start) / 2;

            if (k == a[mid]) {
                return mid;
            } else if (k < a[mid]) {
                end = mid;
            } else if (k > a[mid]) {
                start = mid;
            }
        }

        if(k <= a[start]){
            return start;
        }else if(k > a[end]){
            return end + 1;
        }else {
            return end;
        }

    }

    public static void main(String[] args) {

        int[] a = {2, 6, 10};
        int k = 1;

        SearchInsertPosition s = new SearchInsertPosition();

        int index = s.searchInsertPositionTwo(a, k);
        System.out.println(index);


    }
}
