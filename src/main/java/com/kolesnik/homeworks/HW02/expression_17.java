package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_17 {
    public static void main(String[] args) {
        double x = 2;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = pow(x, 3) / 3 - exp(x) * log(abs(pow(1.3, 3) + pow(x, 3)) + 4 / 3);
        return res;
    }
}
