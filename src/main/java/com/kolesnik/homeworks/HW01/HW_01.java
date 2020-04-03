/*
Task #1
Develop a program that can switch values between two variables
a) using additional variable
b) without additional variable
 */

package com.kolesnik.homeworks.HW01;

public class HW_01 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 20;
        System.out.println("var1 " + var1 + " var2 " + var2);
        int tempvar = var1;
        var1 = var2;
        var2 = tempvar;
        System.out.println("var1 " + var1 + " var2 " + var2);
    }
}