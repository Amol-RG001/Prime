package com.amol.interview.programs;

// join elements of list using ',' using java 8
// input: "apple", "banana", "cherry", "date", "grape"
// output: apple, banana, cherry, date, grape

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _08_JoinListElementsWithStream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("date","banana","grape","apple","berry","cherry","orange");

        String joinedString = words.stream().collect(Collectors.joining(","));
        System.out.println(joinedString);
    }
}
