package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int point = 0;
        String[] ret = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                point++;
            } else {
                ret[i - point] = array[i];
            }
        }
        return ret;
}

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
