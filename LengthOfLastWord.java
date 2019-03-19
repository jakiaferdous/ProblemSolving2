package com.company;

public class LengthOfLastWord {

    public int lengthOfLastWord(String str){

        if(str.length() ==0){
            return 0;
        }

        int len = str.length() -1;
        int count = 0;


        for (int i = len ; i >= 0; i--){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
                count++;

            }else {
                return count;
            }

        }
        return count;

    }
    public static void main(String[] args) {

        String s = "Hello Worldq.";

        LengthOfLastWord l = new LengthOfLastWord();
        int length = l.lengthOfLastWord(s);
        System.out.println(length);


    }
}
