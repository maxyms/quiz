package com.skotarenko.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeLevelOrderTraversalTest {
    @Test
    public void testBasicAssignment() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(new ArrayList<>());
        expected.get(0).add(3);
        expected.add(new ArrayList<>());
        expected.get(1).addAll(Arrays.asList(new Integer[] { 9, 20 }));
        expected.add(new ArrayList<>());
        expected.get(2).addAll(Arrays.asList(new Integer[] { 15, 7 }));
        List<List<Integer>> actual = new BinaryTreeLevelOrderTraversal().levelOrder(root);
        Assert.assertNotNull("Result is null", actual);
        Assert.assertEquals("Size is different", expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            List<Integer> onLevelExpected = expected.get(i);
            List<Integer> onLevelActual = actual.get(i);
            Assert.assertEquals("Size is different", onLevelExpected.size(), onLevelActual.size());
            for (int j = 0; j < onLevelExpected.size(); j++) {
                Assert.assertEquals("Value is different", onLevelExpected.get(j), onLevelActual.get(j));
            }
        }
    }

    @Test
    public void testSizeNull() {
        List<List<Integer>> actual = new BinaryTreeLevelOrderTraversal().levelOrder(null);
        Assert.assertNotNull(actual);
        Assert.assertTrue(actual.isEmpty());
    }
}
