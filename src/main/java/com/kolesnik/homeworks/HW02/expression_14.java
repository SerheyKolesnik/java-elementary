package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_14 {
    public static void main(String[] args) {
        double x = 2;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = (pow(sin(3 * x / 2), 1 / 2) + pow(exp(1.3 * x) + exp(-1.3 * x), 1 / 3)) / (x + 5 / 2);
        return res;
    }
}
