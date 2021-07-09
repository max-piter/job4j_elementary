package ru.job4j.condition;

import org.junit.Test;
import  org.junit.Assert;

public class MaxTest {

    @Test
    public void whenLeft5Right6MaxRight() {
        int left = 5;
        int right = 6;
        int expected = 6;
        int rsl = Max.max(left, right);
        Assert.assertEquals(rsl, expected);

    }

    @Test
    public void whenLeft6Right5MaxLeft() {
        int left = 6;
        int right = 5;
        int expected = 6;
        int rsl = Max.max(left, right);
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenLeft5Right5MaxAnyone() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int rsl = Max.max(left, right);
        Assert.assertEquals(rsl, expected);

    }
}