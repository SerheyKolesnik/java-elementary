/*
 Write a program which checks if a string (array of chars) is a palindrome.
 */
package com.kolesnik.homeworks.HW04;

public class Task_02 {
    public static void main(String[] args) {
        String word = "rotor";
        System.out.printf("String \"%s\" is a palindrome: %s", word, checkPalindrome(word));

    }

    private static boolean checkPalindrome(String word) {
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
