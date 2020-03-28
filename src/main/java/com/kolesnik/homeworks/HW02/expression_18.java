package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_18 {
    public static void main(String[] args) {
        double x = 2;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = abs(7.2 - 10 * x) / pow(pow(x, 2) + exp(x), 1 / 3) * atan((4 * (x / 3))
                / sqrt((pow(1.1, 3) + pow(x, 2))));
        return res;
    }
}
