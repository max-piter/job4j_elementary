package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double k = percent / 100;

        while (amount >= 0) {
            amount = (amount + (amount * k)) - salary;
            year++;
        }
        return year;
    }
}
