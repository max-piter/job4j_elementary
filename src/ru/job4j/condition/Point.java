package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow((x2 - x1), 2);
        double second = Math.pow((y2 - y1), 2);

        return Math.sqrt(first + second);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(2,3,6,-4);
        System.out.println("result (0, 0) to (2, 0) "  + result);
    }
}
