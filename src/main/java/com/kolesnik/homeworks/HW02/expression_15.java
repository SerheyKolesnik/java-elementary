package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_15 {
    public static void main(String[] args) {
        double x = 2;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = (abs(x * log(x - 4)) * pow(x, 1 / 2)) / (pow(exp(4 * x - 1), 1 / 5));
        return res;
    }
}
