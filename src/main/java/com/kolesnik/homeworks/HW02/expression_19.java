package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_19 {
    public static void main(String[] args) {
        double x = 2;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = acos(tan(5 * x / PI)) + pow(x, 3.2) / 28;
        return res;
    }
}
