package com.skotarenko.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        List<StringHolder> lst = new ArrayList<>();
        int l = strs.length;
        char[] carr = null;
        for (int i = 0; i < l; i++) {
            carr = strs[i].toCharArray();
            Arrays.sort(carr);
            lst.add(new StringHolder(i, carr));
        }
        Collections.sort(lst, new Comparator<StringHolder>() {
            @Override
            public int compare(StringHolder o1, StringHolder o2) {
                int l = Math.min(o1.value.length, o2.value.length);
                int res = 0;
                for (int i = 0; i < l; i++) {
                    res = o1.value[i] - o2.value[i];
                    if (res != 0) {
                        return res;
                    }
                }
                if (o1.value.length > l) {
                    return -1;
                }
                if (o2.value.length > l) {
                    return 1;
                }
                return res;
            }
        });
        char[] cValue = null;
        List<String> innerList = new ArrayList<>();
        for (StringHolder sh : lst) {
            if (!Arrays.equals(sh.value, cValue)) {
                if (!innerList.isEmpty()) {
                    Collections.sort(innerList);
                    res.add(innerList);
                }
                innerList = new ArrayList<>();
            }
            innerList.add(strs[sh.index]);
            cValue = sh.value;
        }
        if (!innerList.isEmpty()) {
            Collections.sort(innerList);
            res.add(innerList);
        }
        return res;
    }

    private class StringHolder {
        private int index;
        private char[] value;

        public StringHolder(int index, char[] value) {
            super();
            this.index = index;
            this.value = value;
        }

        @Override
        public String toString() {
            return "(" + index + ")," + Arrays.toString(value);
        }
    }
}
