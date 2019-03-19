package com.company;

public class BinaryAdd {

    public String binaryAdd(String str1, String str2) {

        StringBuilder sb = new StringBuilder();

        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int carry = 0;
        int sum = 0;

        while (i >= 0 || j >= 0) {

            int s1 = 0;
            int s2 = 0;

            if (i >= 0) {
                s1 = (str1.charAt(i) == '0') ? 0 : 1;
                i--;
            }
            if (j >= 0) {
                s2 = (str1.charAt(j) == '0') ? 0 : 1;
                j--;
            }

            sum = carry + s1 + s2;

            if (sum >= 2) {
                sb.append(sum - 2);
                carry = 1;
            }else {
                sb.append(sum);
                carry = 0;
            }


        }

        if(carry == 1){
            sb.append(1);
        }

        System.out.println(sb.reverse().toString());
        return sb.reverse().toString();




    }

    public static void main(String[] args) {

        String s1 = "11";
        String s2 = "11";

        BinaryAdd ba = new BinaryAdd();

        ba.binaryAdd(s1,s2);


    }
}
