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

    @Test
    public void when5and6and46and47then47() {
        int frst = 5;
        int scd = 6;
        int thrd  = 46;
        int frth = 47;
        int expected = 47;
        int rsl = Max.max(frst, scd, thrd, frth);
        Assert.assertEquals(rsl, expected);

    }

    @Test
    public void whenMinus5and6and46then46() {
        int frst = -5;
        int scd = 6;
        int thrd  = 46;
        int expected = 46;
        int rsl = Max.max(frst, scd, thrd);
        Assert.assertEquals(rsl, expected);

    }
}