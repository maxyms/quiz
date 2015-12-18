package com.skotarenko.quiz;

import org.junit.Test;

public class GroupAnagramsTest {
    @Test
    public void testName() throws Exception {
        System.out.println(new GroupAnagrams().groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
    }
}
