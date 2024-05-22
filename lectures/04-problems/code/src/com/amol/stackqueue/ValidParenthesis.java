package com.amol.stackqueue;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "({[]})";

        System.out.println("This balanced string status are : "+isValid(str));
    }
    static boolean isValid(String str){
        // create a stack object
        Stack <Character> stack = new Stack<>();

        for (char ch: str.toCharArray()){
            if(ch=='(' ||ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                if(ch==')'){
                    if(stack.isEmpty() || stack.pop()!='('){
                        return false;
                    }
                }

                if(ch=='}'){
                    if(stack.isEmpty() || stack.pop()!='{'){
                        return false;
                    }
                }

                if(ch==']'){
                    if(stack.isEmpty() || stack.pop()!='['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
