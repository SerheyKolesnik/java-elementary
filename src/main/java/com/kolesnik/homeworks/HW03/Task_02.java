/*
Write function bmi that calculates body mass index
(bmi = weight / height ^ 2).
if bmi <= 18.5 return "Underweight"
if bmi <= 25.0 return "Normal"
if bmi <= 30.0 return "Overweight"
if bmi > 30 return "Obese"
 */
package com.kolesnik.homeworks.HW03;

public class Task_02 {
    public static void main(String[] args) {
        double weight = 86;
        double height = 1.82;
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("bmi = %s value -> %s", bmi, valueBMI(bmi));
    }

    public static String valueBMI(double bmi) {
        String res = "";
        if (bmi <= 18.5) res = "Underweight";
        else if (bmi <= 25.0) res = "Normal";
        else if (bmi <= 30.0) res = "Overweight";
        else if (bmi > 30.0) res = "Obese";
        return res;
    }
}
