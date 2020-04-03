package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_21 {
    public static void main(String[] args) {
        double x = 0.1;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = (pow(tan(x), 1 / 4) + acos(x + 3)) / abs(x + 2 * pow(x, 2));
        return res;
    }
}