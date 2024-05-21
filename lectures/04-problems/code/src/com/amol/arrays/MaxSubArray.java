package com.amol.arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[]arr = {-1,4,6,-89,0,2};
        System.out.println("Maximum sum of sub array : "+subArray(arr));
    }

    static int subArray(int []arr){
        int size = arr.length;
        int curSum = 0;
        int maxSum = arr[0];

        for(int i=0; i<size; i++){
            curSum+=arr[i];
            maxSum = Math.max(maxSum,curSum);

            if(curSum <0){
                curSum = 0;
            }

        }
        return maxSum;

    }
}
