package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_13 {
    public static void main(String[] args) {
        double x = 2;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = pow(exp(x - 2), 1 / 5) / pow(pow(x, 2) + pow(x, 4) + log(abs(x - 3.14)), 1 / 2);
        return res;
    }
}
