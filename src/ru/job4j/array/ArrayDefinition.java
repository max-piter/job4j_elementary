package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Max Korovkin";
        names[1] = "Andrew Korovkin";
        names[2] = "Kirill Korovkin";
        names[3] = "Alex Korovkin";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
