package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return  value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60; /* формула перевода рублей в доллары. */

    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollars.");

        //тесты
        float inForEuro = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(inForEuro);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        float inForDollar = 180;
        float expectedDollar = 3;
        float outDollar = Converter.rubleToDollar(inForDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("180 rubles are 3 dollars. Test result : " + passedDollar);
    }
}
