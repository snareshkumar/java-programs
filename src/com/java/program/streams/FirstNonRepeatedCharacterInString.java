package com.java.program.streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterInString {

    public static void main(String[] args) {
        String str = "samplepsrogram";

        Character ch = str.chars().mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entryset -> entryset.getValue() == 1L)
                .map(entryset -> entryset.getKey())
                .findFirst().get();

        System.out.println("first non repeated character value is " + ch);
    }

}
