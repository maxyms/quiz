package com.skotarenko.quiz;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0] == null || strs[0].length() == 0) {
            return "";
        }
        int l = strs.length, l0 = strs[0].length(), k = -1;
        if (l == 1) {
            return strs[0];
        }
        for (int i = 0; i < l; i++) {
            if (strs[i] == null || strs[i] == "") {
                return "";
            }
        }
        boolean isCommon = true;
        char c = 0;
        while (++k < l0 && isCommon) {
            c = strs[0].charAt(k);
            for (int i = 1; i < l; i++) {
                if (strs[i].length() <= k || strs[i].charAt(k) != c) {
                    isCommon = false;
                    break;
                }
            }
        }
        return isCommon ? strs[0] : strs[0].substring(0, k - 1);
    }
}
