package com.amol.interview.programs;

import java.util.Arrays;
import java.util.List;

// remove strings from list which has 'an' present in it using java 8
// input: "date","banana","grape","apple","berry","cherry","orange"
// output: filter words: [date, grape, apple, berry, cherry]


public class _07_RemoveElementsWithStream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("date","banana","grape","apple","berry","cherry","orange");

        String substringToRemove = "an";

        List<String> filterWords = words.stream().filter(word -> (!word.contains(substringToRemove))).toList();

        System.out.println("filter words: "+filterWords);

    }

}
