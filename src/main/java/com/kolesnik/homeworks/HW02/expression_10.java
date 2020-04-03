package com.kolesnik.homeworks.HW02;

public class expression_10 {
    public static void main(String[] args) {
        double x = 2;
        String y = Double.toString(expression_(x));
        System.out.println("x = " + x + "\ny = " + y);
    }

    private static double expression_(double x) {
        double res = (1 / 3) * Math.pow(Math.abs(Math.sin(x)), 0.5) * Math.pow(Math.exp(0.12 * x), 1 / 3);
        return res;
    }
}
