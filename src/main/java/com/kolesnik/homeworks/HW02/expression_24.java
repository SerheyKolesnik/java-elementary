package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_24 {
    public static void main(String[] args) {
        double x = 0.1;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = atan(abs(8.3 - 21 * pow(x, 2) - 0.8 * x) / pow(2.5 + 1 / pow(x, 2), 1 / 3));
        return res;
    }
}
