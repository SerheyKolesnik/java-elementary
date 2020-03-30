/*
Introduction.
The first century spans from the year 1 up to and including the year 100,
The second - from the year 101 up to and including the year 200, etc.
Task:
Given a year, return the century it is in.
Input , Output Examples :
centuryFromYear(1705) returns (18)
centuryFromYear(1900) returns (19)
centuryFromYear(1601) returns (17)
centuryFromYear(2000) returns (20)
 */
package com.kolesnik.homeworks.HW03;

public class Task_03 {
    public static void main(String[] args) {
        int inputYear = 2000;
        int centure = (inputYear - 1) / 100 + 1;
        System.out.printf("Year %s century %s\n", inputYear, centure);
        System.out.println("this can be done with a cycle with conditions\n" +
                "in target to repeat the topic:");
        System.out.printf("Year %s century %s", inputYear, century(inputYear));
    }

    public static int century(int year_) {
        int res = 0;
        int iterations = 0;
        while (res == 0 || iterations < 100) {
            if (year_ >= iterations * 100 + 1 && year_ < iterations * 100 + 101) {
                res = iterations + 1;
                break;
            }
            iterations++;
        }
        return res;
    }
}
