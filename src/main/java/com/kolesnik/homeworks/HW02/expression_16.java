package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_16 {
    public static void main(String[] args) {
        double x = 2;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = pow(exp(2 * x) * sqrt(x) - (x + 1 / 3) / x, 1 / 3) * abs(cos(2.5 * x));
        return res;
    }
}
