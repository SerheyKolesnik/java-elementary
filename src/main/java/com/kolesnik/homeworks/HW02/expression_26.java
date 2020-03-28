package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_26 {
    public static void main(String[] args) {
        double x = 0.1;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = log(abs(sin(x))) + 2 * exp(x) + 2 * cos(abs(x)) + 2;
        return res;
    }
}
