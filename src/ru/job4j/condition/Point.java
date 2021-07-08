package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(2, 3, 6, -4);
        double result3 = Point.distance(3, 4, 5, 6);
        double result4 = Point.distance(7, 8, 9, 10);
        double result5 = Point.distance(-1, 4, -5, 2);
        System.out.println("result (0, 0) to (2, 0) "  + result);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
