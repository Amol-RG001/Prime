package com.amol.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//  filter even numbers from list using java 8
//  input: 3,5,1,-1,-9,8,7,6
//  output: even numbers : [6,8]

public class _01_FilterListWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,5,1,-1,-9,8,7,6);

        List<Integer> evenNumbers = numbers
                .stream()
                .sorted()
                .filter(nums -> nums % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("even numbers : "+evenNumbers);
    }
}
