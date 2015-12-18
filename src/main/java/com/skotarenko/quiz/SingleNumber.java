package com.skotarenko.quiz;

import java.util.Arrays;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.

    Note:
    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 * @author maxyms
 *
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        return singleNumber2(nums);
    }

    private int singleNumberHard(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        for (int i = 0; i < l / 2; i++) {
            if (nums[2 * i] != nums[2 * i + 1]) {
                return nums[2 * i];
            }
        }
        if (l % 2 > 0) {
            return nums[l - 1];
        }
        return -1;
    }

    private int singleXOR(int[] nums) {
        int l = nums.length;
        int p = 0;
        for (int i = 0; i < l; i++) {
            p ^= nums[i];
        }
        return p == 0 ? -1 : p;
    }

    /**
     * Given an array of integers, every element appears three times except for one. Find that single one.
     */
    public int singleNumber2(int[] nums) {
        int l = nums.length;
        int p = 0;
        for (int i = 0; i < l; i++) {
            p ^= nums[i];
        }
        return p == 0 ? -1 : p;
    }
}
