/*
Write a program which finds minimal number in int array
 */
package com.kolesnik.homeworks.HW04;

import java.util.Arrays;
import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RandomNum(10);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Minimal item in array " + MinItemNumber(arr)
                + " is value number " + arr[MinItemNumber(arr)]);
    }

    private static int RandomNum(int span_) {
        Random r = new Random();
        return r.nextInt(span_);
    }

    private static int MinItemNumber(int[] array) {
        int minItem_ = 0;
        for (int n : array) {
            if (array[n] < array[minItem_]) {
                minItem_ = n;
            }
        }
        return minItem_;
    }
}
