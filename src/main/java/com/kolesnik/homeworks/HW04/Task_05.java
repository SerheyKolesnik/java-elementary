/*
2. Написать программу перевода из десятичной системы в двоичную и обратно
 */
package com.kolesnik.homeworks.HW04;

public class Task_05 {
    public static void main(String[] args) {
        int i = 145;
        String s = "10010001";
        binar(i);
        decimal(s);
    }

    public static void binar(int number) {
        int digit;
        int startNum = number;
        int counter = 0;
        String strBinar = "";
        while (counter != 8) {
            digit = number % 2;
            strBinar = digit + strBinar;
            number = number / 2;
            counter++;
        }
        System.out.println("number " + startNum + " in binary: " + strBinar);
    }

    public static void decimal(String binar) {
        char[] charArray = binar.toCharArray();
        int n;
        int res = 0;
        String cc;
        char ch;
        for (int i = 8; i > 0; i--) {
            ch = charArray[i - 1];
            cc = String.valueOf(ch);
            n = Integer.parseInt(cc);
            if (n == 1) {
                res += Math.pow(2, charArray.length - i);
            }
        }
        System.out.println("number " + binar + " in decimal: " + res);
    }
}
