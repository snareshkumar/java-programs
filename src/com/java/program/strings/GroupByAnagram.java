package com.java.program.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByAnagram {

    private static void groupAnagramsByWords(String[] words) {

        Map<String, List<String>> groupAnagram = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String individualWord = words[i];
            char[] arr = individualWord.toLowerCase().toCharArray();
            Arrays.sort(arr);

            String newWord = new String(arr);

            if (groupAnagram.containsKey(newWord)) {
                groupAnagram.get(newWord).add(individualWord);

            } else {
                List<String> wordsList = new ArrayList<>();
                wordsList.add(individualWord);
                groupAnagram.put(newWord, wordsList);
            }

        }

        System.out.println("values are " + groupAnagram);

    }

    public static void main(String[] args) {

        String[] words = { "cat", "act", "tac", "dog", "god", "odo" };
        groupAnagramsByWords(words);

    }

}
