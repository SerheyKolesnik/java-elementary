/*
Write a program which calculates the sum of two columns.
Print table with results if columns have the same size (col_1| col_2 | sum).
Otherwise print which column has bigger size
 */
package com.kolesnik.homeworks.HW04;

import java.util.Random;

public class Task_03 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        fillArray(arr1);
        fillArray(arr2);
        compareArr(arr1, arr2);

    }

    private static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RandomNum(10);
        }
    }

    private static int RandomNum(int span_) {
        Random r = new Random();
        return r.nextInt(span_);
    }

    private static void compareArr(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            System.out.println("column 1 has bigger size");
        } else if (arr1.length < arr2.length) {
            System.out.println("column 2 has bigger size");
        } else {
            System.out.println("(col_1| col_2 | sum)");
            for (int i = 0; i < arr1.length; i++) {
                System.out.printf("(%s | %s | %s)\n", arr1[i], arr2[i], arr1[i] + arr2[i]);
            }
        }
    }
}