package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_12 {
    public static void main(String[] args) {
        double x = 2;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = log(pow(abs(2 - x), 1 / 2) + 1.2) / (2 + exp(-x)) + pow(2 / x, 1 / 3);
        return res;
    }
}
