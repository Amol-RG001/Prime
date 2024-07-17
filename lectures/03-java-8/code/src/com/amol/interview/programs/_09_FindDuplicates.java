package com.amol.interview.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _09_FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 3, 4, 5, 7, 8, 9, 1);

        // Find duplicates
        Set<Integer> duplicates = findDuplicates(numbers);

        // Print duplicates
        System.out.println("Duplicate elements: " + duplicates);
    }

    public static Set<Integer> findDuplicates(List<Integer> list) {
        Set<Integer> items = new HashSet<>();
        return list.stream()
                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set
                .collect(Collectors.toSet());
    }
}
