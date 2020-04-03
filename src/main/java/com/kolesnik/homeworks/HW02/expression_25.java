package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_25 {
    public static void main(String[] args) {
        double x = 0.1;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = pow(log(acos(abs(abs(pow(x, 3.4) + 2.5 * pow(x, 1.3) - 0.7)
                / pow(exp(2.5 * x), 1 / 3)))), 1 / 4) + 1;
        return res;
    }
}
