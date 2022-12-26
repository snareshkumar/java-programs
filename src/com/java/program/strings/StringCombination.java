package com.java.program.strings;

public class StringCombination {

    public static void wordcombination(String prefix, String word) {

        if (word.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < word.length(); i++) {
                wordcombination(prefix + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }

    }

    public static void main(String[] args) {
        String word = "naresh";
        wordcombination("", word);
    }

}
