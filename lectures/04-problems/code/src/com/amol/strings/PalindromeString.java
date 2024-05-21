package com.amol.strings;

public class PalindromeString {
    public static void main(String[] args) {
        String original = "ABBA";
        //two-pinter
        if(isPalindrome(original)){
            System.out.println("Yes, Palindrome.");
        }
        else {
            System.out.println("Not, Palindrome.");
        }

        //using string builder
        if (checkPalindromeStrBuilder(original)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }

    // two pointer technique
    static boolean isPalindrome(String s){
        int start  = 0;
        int end = s.length()-1;

        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;

    }

// using string builder
    static boolean checkPalindromeStrBuilder(String str) {
        if (str == null) {
            return false;
        }
        StringBuilder strBuilder = new StringBuilder(str);
        StringBuilder rev = strBuilder.reverse();
        return str.equals(rev.toString());
    }
}
