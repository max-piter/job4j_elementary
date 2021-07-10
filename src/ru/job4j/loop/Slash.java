package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int i = 1; i <= size; i++) {
            for (int c = 1; c <= size; c++) {
                if (i == c) {
                    System.out.print("0");
                } else if (i + c  == size + 1) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);

        }
    }
