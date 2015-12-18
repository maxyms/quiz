package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    @Test
    public void test1() {
        String expected = "", actual = new LongestCommonPrefix().longestCommonPrefix(null);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String[] input = new String[] { "test" };
        String expected = "test", actual = new LongestCommonPrefix().longestCommonPrefix(input);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        String[] input = new String[] { "test", "test" };
        String expected = "test", actual = new LongestCommonPrefix().longestCommonPrefix(input);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String[] input = new String[] { "test", "tedf" };
        String expected = "te", actual = new LongestCommonPrefix().longestCommonPrefix(input);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String[] input = new String[] { "test", "tedf", "tasd", "test22" };
        String expected = "t", actual = new LongestCommonPrefix().longestCommonPrefix(input);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String[] input = new String[] { "te", "tedf", "tasdjkl", "test22jkljlj" };
        String expected = "t", actual = new LongestCommonPrefix().longestCommonPrefix(input);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        String[] input = new String[] { "te", "tedf", null, "test22jkljlj" };
        String expected = "", actual = new LongestCommonPrefix().longestCommonPrefix(input);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        String[] input = new String[] { "te", "tedf", "test", "" };
        String expected = "", actual = new LongestCommonPrefix().longestCommonPrefix(input);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        String[] input = new String[] { "testmperature", "testmdf", "test" };
        String expected = "test", actual = new LongestCommonPrefix().longestCommonPrefix(input);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        String[] input = new String[] {};
        String expected = "", actual = new LongestCommonPrefix().longestCommonPrefix(input);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        String[] input = new String[] { "c", "c" };
        String expected = "c", actual = new LongestCommonPrefix().longestCommonPrefix(input);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals(expected, actual);
    }
}
