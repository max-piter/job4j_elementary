package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divideAndSubstract(double first, double second) {
        return divide(first, second) + substraction(first, second);
    }

    public static double sumAllFunction(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + divide(first, second) + substraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }

}
