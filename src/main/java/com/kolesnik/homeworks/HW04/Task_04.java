/*
• * Write a program which checks if given number is
STRONG, i.e. the sum of the factorials of its digits is equal
to number itself: 1! + 4! + 5! = 1 + 24 + 120 = 145

 */
package com.kolesnik.homeworks.HW04;

public class Task_04 {
    public static void main(String[] args) {
        int inputNum = 145;
        System.out.printf("Number %s is STRONG: %s", inputNum, checkStrongNumber(inputNum));
    }

    private static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    private static int[] numArr(int number_) {
        String n = Integer.toString(number_);
        char[] charArray = n.toCharArray();
        int[] arr = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }
        return arr;
    }

    private static boolean checkStrongNumber(int number_) {
        int sumFactorialsDigit = 0;
        for (int i = 0; i < numArr(number_).length; i++) {
            sumFactorialsDigit += calculateFactorial(numArr(number_)[i]);
        }
        if (sumFactorialsDigit == number_) {
            return true;
        }
        return false;
    }
}
