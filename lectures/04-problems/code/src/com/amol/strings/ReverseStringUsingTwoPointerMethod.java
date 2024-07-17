package com.amol.strings;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

import static java.util.Collections.max;

public class ReverseStringUsingTwoPointerMethod{

    public static void main (String[] args){

        String [] arr = {"mango","pineapple","cherry"};

        Optional<String> obj = Arrays.stream(arr).max(Comparator.comparingInt(String::length));
        System.out.println(obj.get());

        String str1 = "kurushetra";

        reverseString(str1);

        System.out.println(reverseString(str1));

    }

    static String reverseString(String str1){

        char[] ch = str1.toCharArray();
        int left=0;
        int right = ch.length-1;
        char temp;
        while(left < right){

            temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;

        }
        return new String(ch);
    }
}

