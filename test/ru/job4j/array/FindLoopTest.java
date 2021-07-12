package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas9Then9() {
        int[] data = {5, 4, 3, 2, 3, 5, 6, 7, 8, 9};
        int el = 9;
        int result = FindLoop.indexOf(data, el);
        int expected = 9;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas8ThenMinus1() {
        int[] data = {3, 3, 3, 3};
        int el = 8;
        int result = FindLoop.indexOf(data, el);
        int expected =  -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind6() {
        int[] data = new int[] {5, 2, 10, 2, 4, 5, 3, 6};
        int el = 6;
        int start = 4;
        int finish = 7;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind1thenNo() {
        int[] data = new int[] {5, 2, 10, 2, 4, 2, 1, 2, 9};
        int el = 1;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}