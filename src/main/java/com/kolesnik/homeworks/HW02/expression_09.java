package com.kolesnik.homeworks.HW02;

public class expression_09 {
    public static void main(String[] args) {
        double x = 1;
        System.out.println("x = " + x + "\ny = " + expression_(x));
    }

    private static double expression_(double x) {
        double res = 1.1 * Math.exp(-x) + Math.abs(Math.cos(Math.pow(Math.PI * x, 0.5))) - 3 / 8;
        return res;
    }
}
