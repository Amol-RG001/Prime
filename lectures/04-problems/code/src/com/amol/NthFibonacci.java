package com.amol;

public class NthFibonacci {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibo(n));
    }

    static int fibo(int i){

        // return same value
        // when number is less than or equal to 1
        if(i<=1){
            return i;
        }

        // recursive approach
        return fibo(i-1) + fibo(i-2);
        }



}
