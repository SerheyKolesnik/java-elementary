package com.kolesnik.homeworks.HW02;

import static java.lang.Math.*;

public class expression_11 {
    public static void main(String[] args) {
        double x = 2;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = 2 * PI * x - abs(sin(pow(10.5 * x, 1 / 2))) * 1 / (pow((pow(x, 2) + 1 / 7), 1 / 3));
        return res;
    }
}
