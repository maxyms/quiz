package com.skotarenko.quiz;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        int l = nums.length;
        //nullify all negative elements and numbers greater than array length 
        for (int i = 0; i < l; i++) {
            if (nums[i] < 0 || nums[i] > l) {
                nums[i] = 0;
            }
        }
        int i = 0;
        // place all elements in ascending order in their indexes (1 in position 0, 2 in postion 1, etc)
        // after this operation all elements should be in sorted order
        while (i < l) {
            int val = nums[i];
            if (val == 0 || val == i + 1) {
                i++;
            } else {
                int tmp = nums[val - 1];
                if (tmp != val) {
                    nums[val - 1] = val;
                    nums[i] = tmp;
                } else {
                    nums[i] = 0;
                    i++;
                }
            }
        }
        int j = 0;
        int val = nums[j];
        // check if element's position corresponds to its value
        // if not - number is missing
        while (j < l && val > 0) {
            val = nums[j];
            if (val != j + 1) {
                return j + 1;
            }
            j++;
        }
        return j + 1;
    }

    private void processIndex(int[] nums, int index, int l) {
        int val = nums[index];
        if (val <= 0 || val > l) {
            nums[index] = 0;
        } else {
            if (val == index + 1) {
                //skip;
            } else {
                int tmp = nums[val];
                while (tmp > 0) {
                    nums[val] = val;
                }
            }
        }
    }

    public int firstMissingPositiveHard(int[] nums) {
        int l = nums.length;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < l; i++) {
            if (nums[i] > 0) {
                set.add(nums[i]);
            }
        }
        Iterator<Integer> it = set.iterator();
        int iter = 0;
        while (it.hasNext()) {
            if (++iter != it.next()) {
                return iter;
            }
        }
        return set.size() + 1;
    }
}
