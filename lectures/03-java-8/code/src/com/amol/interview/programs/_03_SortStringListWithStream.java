package com.amol.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// sort a list using java 8
// input: "banana", "apple", "cherry"
// output: ["apple", "banana","cherry"]

public class _03_SortStringListWithStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "cherry");
        List<String> words = list
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted words : "+words);
    }
}
