package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan185Then97() {
        short in = 185;
        double expected = 97.7;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenWoman170Then69() {
        short womanHeight = 170;
        double expected = 69;
        double out  = Fit.womanWeight(womanHeight);
        Assert.assertEquals(expected, out, 0.01);
    }
}