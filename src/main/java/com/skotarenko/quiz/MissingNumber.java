package com.skotarenko.quiz;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int l = nums.length, sumExpected = l, sumActual = 0;
        for (int i = 0; i < l; i++) {
            sumExpected += i;
            sumActual += nums[i];
        }
        return sumExpected - sumActual;
    }
}
