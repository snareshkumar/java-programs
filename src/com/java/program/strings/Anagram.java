package com.java.program.strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String firstString = "sample";
        String secondString = "psamel";

        boolean flag = findIsAnagram(firstString, secondString);
        if (flag) {
            System.out.println("provided string values are anagram");

        } else {
            System.out.println("Provided strings are not anagram");
        }
    }

    private static boolean findIsAnagram(String firstString, String secondString) {
        if (firstString.length() == secondString.length()) {
            char[] str1 = firstString.toLowerCase().toCharArray();
            char[] str2 = secondString.toLowerCase().toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            return Arrays.equals(str1, str2);
        }
        return false;
    }

}
