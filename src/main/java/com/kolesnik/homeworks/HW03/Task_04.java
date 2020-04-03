/*
You are given a function describeAge that takes a parameter age(which
will always be a positive integer) and does the following:
If the age is 12 or lower, it return "You're a(n) kid"
If the age is anything between 13 and 17 (inclusive), it return "You're a(n)teenager"
If the age is anything between 18 and 64 (inclusive), it return "You're a(n)adult"
If the age is 65 or above, it return "You're a(n) elderly"
Your task is to shorten the code as much as possible
 */
package com.kolesnik.homeworks.HW03;

public class Task_04 {
    public static void main(String[] args) {
        int age = 17;
        System.out.println("Age " + age + "\nYou're a(n) "
                + ((age < 12) ? "Kid" : (age <= 17) ? "teenager" : (age <= 65) ? "adult" : "elderly"));
    }
}