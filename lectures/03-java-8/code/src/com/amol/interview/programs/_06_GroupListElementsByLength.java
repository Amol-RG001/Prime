package com.amol.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// group by string of equal length from list using java 8
// input: "date","banana","grape","apple","berry","cherry","orange"
// output: Group by length: {4=[date], 5=[grape, apple, berry], 6=[banana, cherry, orange]}

public class _06_GroupListElementsByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("date","banana","grape","apple","berry","cherry","orange");

        Map<Integer, List<String>> wordsGroup= words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Group by length: "+wordsGroup);
    }
}
