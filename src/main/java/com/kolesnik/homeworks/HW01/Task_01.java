package com.kolesnik.homeworks.HW01;

public class Task_01 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 20;
        System.out.println("var1 " + var1 + " var2 " + var2);
        int tempvar = var1;
        var1 = var2;
        var2 = tempvar;
        System.out.println("change with temporary variable:var1 " + var1 + " var2 " + var2);
//  option without a temporary variable
        var1 = var1 + var2 - (var2 = var1);
        System.out.printf("change without temporary variable:\nvar1 %s var2 %s", var1, var2);
    }
}
