package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean bool : data) {
            if (data[0] == bool) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
