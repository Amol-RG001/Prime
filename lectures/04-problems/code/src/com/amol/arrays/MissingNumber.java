package com.amol.arrays;

// find the missing number in an array.
public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {3,5,1,0,2};
        System.out.println("The missing number of given array is : "+findNumber(arr));
    }

    static int findNumber(int [] arr){
        // calculate length of an array
        int size = arr.length;

        int sum = ( size * ( size + 1 ) / 2 );

        for (int num:arr) {
            sum -= num;
        }
        return sum;
    }
}
