package com.company;

public class MinSubArrayLen {

    public int minSubArrayLen(int[] a, int k){

        int minLen = a.length;
        int sum = 0;

        for(int i = 0; i < a.length; i++){

            if(a[i] >= k){
                return 1;
            }
            sum = a[i];

            for(int j = i+1; j < a.length; j++){

                sum += a[j];

                if((j - i + 1  < minLen) && (sum >= k)){
                    minLen = j - i + 1;
                }
            }

        }
        return minLen;

    }



    public static void main(String[] args) {

        int[] a = {6,2,8};
        int k = 8;

        MinSubArrayLen min = new MinSubArrayLen();
        int minLen = min.minSubArrayLen(a,k);
        System.out.println(minLen);



    }
}
