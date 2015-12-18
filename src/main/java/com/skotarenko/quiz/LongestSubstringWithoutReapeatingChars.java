package com.skotarenko.quiz;

/**
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1.
 * 
 * @author maxyms
 *
 */
public class LongestSubstringWithoutReapeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[256];
        for (int i = 0; i < 256; i++) {
            chars[i] = -1;
        }
        int maxL = 0;
        int minPos = 0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (chars[c] != -1 && chars[c] >= minPos) {
                maxL = i - minPos > maxL ? i - minPos : maxL;
                minPos = chars[c] + 1;
            }
            chars[c] = i;
        }
        maxL = l - minPos > maxL ? l - minPos : maxL;
        return maxL;
    }
}
