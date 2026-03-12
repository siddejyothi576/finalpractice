package com.example.MyJavaPracticeFinal.strings;

public class ReverseStringTwoPointer {

    public static void main(String[] args) {

        String s="hello";


        String reverse =ReverseStringTwoPointer.reverseString(s);

        System.out.println(reverse);

    }

    static String reverseString(String s){

        char[] charArray =s.toCharArray();
        int left=0;
        int right =s.length()-1;
        while(left<right){
            char temp =charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;

            left++;
            right--;

        }
        return new String(charArray);

    }
}
