/*
Task #2
I have a cat and a dog. I got them at the same time as kitten/puppy. That was humanYears years ago.
Calculate their respective ages now.
NOTES:
humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
EXAMPLE output:
HumanYears: 4
CatYears: 32
DogYears: 34
 */

package com.kolesnik.homeworks.HW01;


import java.util.Scanner;

public class HW_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter human years:");
        int humanYears = scanner.nextInt();
        int catYears;
        int dogYears;

        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;
        } else if (humanYears == 2) {
            catYears = 24;
            dogYears = 24;
        } else if (humanYears == 3) {
            catYears = 28;
            dogYears = 29;
        } else {
            catYears = 28 + (humanYears - 3) * 4;
            dogYears = 29 + (humanYears - 3) * 5;
        }
        System.out.println("HumanYears: " + humanYears
                + "\nCatYears: " + catYears + "\nCatYears: " + dogYears);

    }
}