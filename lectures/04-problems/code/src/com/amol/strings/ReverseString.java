package com.amol.strings;

import static java.util.Collections.reverse;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";


       reverseStr(str);
    }

    static public void reverseStr(String str){
        char [] rev = str.toCharArray();
        String n = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            n += rev[i];
        }

        System.out.println(n);
    }
}

//
