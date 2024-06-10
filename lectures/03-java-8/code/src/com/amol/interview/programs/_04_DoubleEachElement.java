package com.amol.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// double each element of list using java 8
// input : 1,2,3,4,5,6,-4
// output : double elements : [2, 4, 6, 8, 10, 12, -8]

public class _04_DoubleEachElement {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,-4);

        List<Integer> numbsList = nums
                .stream()
                .map(d-> d*2)
                .collect(Collectors.toList());

        System.out.println("double elements : "+numbsList);
    }
}
