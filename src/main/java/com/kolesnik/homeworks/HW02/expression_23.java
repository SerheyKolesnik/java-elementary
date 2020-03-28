package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_23 {
    public static void main(String[] args) {
        double x = 0.1;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = acos(abs(tan(5 * x / PI))) + pow(x, 5.7) / 23;
        return res;
    }
}
