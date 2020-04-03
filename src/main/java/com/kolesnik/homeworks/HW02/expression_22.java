package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_22 {
    public static void main(String[] args) {
        double x = 0.1;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = asin(log10(x) / (pow(x, 2) + 5 * x + 1)) - pow(x, 1.2) / 28;
        return res;
    }
}