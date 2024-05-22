package com.amol.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {2,8,3,17,5};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int [] arr){
        //base case to prevent infinite recursion
        if (arr.length <= 1) {
            return arr;
        }

        int start = 0;
        int end = arr.length;

        int mid = start + (end - start) / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, start, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, end));

        return merge(left,right);
    }

    private static int[] merge(int[] firstHalf, int[] secondHalf) {

        int [] mix = new int[firstHalf.length + secondHalf.length];

        int i=0 , j=0, k=0;

        while (i< firstHalf.length && j < secondHalf.length){

            if (firstHalf[i] < secondHalf[j]){
                mix[k] = firstHalf[i];
                i++;
            }else{
                mix[k] = secondHalf[j];
                j++;
            }
            k++;
        }

        // it may possible that one of arrays is not complete

        while (i < firstHalf.length){
            mix[k] = firstHalf[i];
            i++;
            k++;
        }

        while (j < secondHalf.length){
            mix[k] = secondHalf[j];
            j++;
            k++;
        }
        return mix;
    }
}
