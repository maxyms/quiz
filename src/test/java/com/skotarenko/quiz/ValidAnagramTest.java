package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class ValidAnagramTest {
    @Test
    public void testName() throws Exception {
        Assert.assertTrue(new ValidAnagram().isAnagram("anagram", "nagaram"));
        Assert.assertFalse(new ValidAnagram().isAnagram("rat", "car"));
        Assert.assertTrue(new ValidAnagram().isAnagram("тествюникоде", "юникодевтест"));
    }
}
