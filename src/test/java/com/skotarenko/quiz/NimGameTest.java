package com.skotarenko.quiz;

import org.junit.Test;

public class NimGameTest {
    @Test
    public void testName() throws Exception {
        for (int i = 0; i < 20; i++) {
            System.out.format("Stones: %d, result: %b \n", i, new NimGame().canWinNim(i));
        }
    }
}
