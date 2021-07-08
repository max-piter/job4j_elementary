package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return  (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 185;
        short womanHeight = 170;
        double idealMan = Fit.manWeight(manHeight);
        double idealWoman = Fit.womanWeight(womanHeight);
        System.out.println("Man 180 is " + idealMan);
        System.out.println("Woman 167 is " + idealWoman);
    }
}
