package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_20 {
    public static void main(String[] args) {
        double x = 2;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = (pow(log(2 * x), 1 / 3) + tan(cos(PI * x))) * abs(log(x / 10.5) + 1 / 3);
        return res;
    }
}
