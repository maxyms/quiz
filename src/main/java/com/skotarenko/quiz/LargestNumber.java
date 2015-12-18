package com.skotarenko.quiz;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given a list of non negative integers, arrange them such that they form the largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.
 * @author maxyms
 *
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        int l = nums.length;
        String[] s = new String[l];
        for (int i = 0; i < l; i++) {
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int l1 = o1.length(), l2 = o2.length(), minL = Math.min(l1, l2);
                if (l1 == l2) {
                    return Integer.parseInt(o2) - Integer.parseInt(o1);
                }
                if (l1 < l2) {
                    String base = o1;
                    int reps = l2 / l1;
                    int mod = l2 % l1;
                    for (int i = 0; i < reps - 1; i++) {
                        o1 += base;
                    }
                    o1 += base.substring(0, mod);
                    int res = Integer.parseInt(o2) - Integer.parseInt(o1);
                    if (res == 0) {
                        String rest = o2.substring(l2 - mod);
                        //-----
                        String base_ = rest;
                        int reps_ = base.length() / rest.length();
                        //                        int mod = l2 % l1;
                        for (int i = 0; i < reps - 1; i++) {
                            o1 += base;
                        }
                        o1 += base.substring(0, mod);
                        //-----
                        int r = (int) Math.pow(10, minL - mod) * Integer.parseInt(rest);
                        return Integer.parseInt(o1) - r;
                    }
                    return res;
                }
                String base = o2;
                int reps = l1 / l2;
                int mod = l1 % l2;
                for (int i = 0; i < reps - 1; i++) {
                    o2 += base;
                }
                o2 += base.substring(0, mod);
                int res = Integer.parseInt(o2) - Integer.parseInt(o1);
                if (res == 0) {
                    String rest = o1.substring(l1 - mod);
                    int r = (int) Math.pow(10, minL - mod) * Integer.parseInt(rest);
                    //                    return r - Integer.parseInt(base);
                    System.out.println(Integer.parseInt(base) + " - " + r + " = " + (Integer.parseInt(base) - r));
                    return Integer.parseInt(base) - r;
                }
                return res;
                //                                int intBase = Integer.parseInt(base);
                //                                int part = Integer.parseInt(longer.substring(0, minL));
                //                                String rest = longer.substring(minL);
                //                
                //                
                //                
                //                return doCompare(o1, o2);
                //                int intBase = Integer.parseInt(base);
                //                int part = Integer.parseInt(longer.substring(0, minL));
                //                String rest = longer.substring(minL);
                //                
                //                if(rest.length() == 0){
                //                    if (l1 > l2) {
                //                        return intBase - part;
                //                    }
                //                    return part - intBase;
                //                    
                //                }else{
                //                    
                //                }
                //                
                //                
                //                
                //                while (intBase == part && rest.length() > 0) {
                //                    if (rest.length() > minL) {
                //                        part = Integer.parseInt(rest.substring(0, minL));
                //                        rest = rest.substring(minL);
                //                    } else {
                //                        part = (int) Math.pow(10, minL - rest.length()) * Integer.parseInt(rest);
                //                        break;
                //                    }
                //                }
                //                if (l1 > l2) {
                //                    return intBase - part;
                //                }
                //                return part - intBase;
            }

            private int doCompare(String o1, String o2) {
                int l1 = o1.length(), l2 = o2.length(), minL = Math.min(l1, l2);
                if (l1 == 0) {
                    return 1;
                }
                if (l2 == 0) {
                    return -1;
                }
                if (l1 == l2) {
                    return Integer.parseInt(o2) - Integer.parseInt(o1);
                }
                String longer = o2;
                String base = o1;
                int res = Integer.parseInt(longer.substring(0, minL)) - Integer.parseInt(base);
                if (l1 > l2) {
                    longer = o1;
                    base = o2;
                    res = -res;
                }
                if (res != 0) {
                    return res;
                }
                String o1_new = o1.substring(minL);
                String o2_new = o2.substring(minL);
                return doCompare(o1_new, o2_new);
            }
        });
        if (s.length > 0 && "0".equals(s[0])) {
            return s[0];
        }
        System.out.println(Arrays.toString(s));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            sb.append(s[i]);
        }
        return sb.toString();
    }
}
