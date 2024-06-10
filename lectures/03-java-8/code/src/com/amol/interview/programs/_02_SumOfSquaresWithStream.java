package com.amol.interview.programs;
// find the sum of square from list  using java 8
// input:  1,2,3,4,5,0
// output : 55

import java.util.Arrays;
import java.util.List;

public class _02_SumOfSquaresWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,0);
        int sumOfSquare = numbers
                .stream()
                .mapToInt(nums -> nums * nums)
                .sum();

        System.out.println("sum of squares : "+sumOfSquare);
    }
}
