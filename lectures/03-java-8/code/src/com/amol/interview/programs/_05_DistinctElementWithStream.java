package com.amol.interview.programs;

// find the distinct element from list using java 8
// input: 1,3,2,4,2,4,3,3,5,5,5
// output: distinct elements : [1,2,3,4,5]

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _05_DistinctElementWithStream {
    public static void main(String[] args) {
        List<Integer> numbs = Arrays.asList(1,3,2,4,2,4,3,3,5,5,5);

        List<Integer> distinctNumbers = numbs
                .stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct Elements : "+distinctNumbers);
    }
}
