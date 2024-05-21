package com.amol.strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
//        System.out.println("Anagram string status : "+isAnagram(str1,str2));

        if(isAnagram(str1,str2)){
            System.out.println("\'"+str1+"\'" +" and "+"\'"+str2+"\'"+" strings are anagrams");
        }else{
            System.out.println("length of strings are not equal : "+"\'"+str1+"\'" +" and "+"\'"+str2+"\'");
        }
    }

    static boolean isAnagram(String str1, String str2){
        // check length of string are equal
        if(str1.length()!=str2.length()){
            return false;
        }
        // break strings into char
        char [] c1 = str1.toCharArray();
        char [] c2 = str2.toCharArray();

        // sort the c1  and c2
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);

    }
}
