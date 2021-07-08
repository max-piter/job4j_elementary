package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K6Square4point4() {
        double expected = 4.4;
        int p = 12;
        double k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP11K10Square2point5() {
        double expected = 2.5;
        int p = 11;
        double k = 10;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}