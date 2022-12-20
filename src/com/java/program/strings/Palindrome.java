package com.java.program.strings;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "malayalam";

        boolean flag = checkIsPalindrome(str1);
        if (flag) {
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    private static boolean checkIsPalindrome(String str1) {

        String reversedString = "";

        char[] arr = str1.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedString = reversedString + arr[i];
        }

        if (str1.equalsIgnoreCase(reversedString)) {
            return true;
        }

        return false;
    }
}
