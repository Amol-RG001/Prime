package com.amol.search;

public class BS{
    public static void main(String[] args) {

        int [] arr = {-9,10,30,40,41,55,89};
        System.out.println(binarySearch(arr,30));
    }

    static int binarySearch(int [] arr, int target){
        int end = arr.length-1;
        int start = 0;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if ( target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
