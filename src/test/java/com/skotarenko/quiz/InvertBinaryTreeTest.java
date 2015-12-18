package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class InvertBinaryTreeTest {
    @Test
    public void testName() throws Exception {
        TreeNode root = new TreeNode(4);
        TreeNode node = new TreeNode(2);
        root.left = node;
        node.left = new TreeNode(1);
        node.right = new TreeNode(3);
        node = new TreeNode(7);
        node.left = new TreeNode(6);
        node.right = new TreeNode(9);
        root.right = node;
        TreeNode newRoot = new InvertBinaryTree().invertTree(root);
        Assert.assertEquals(
                "(4) left=(7) left=(9) left=null, right=null], right=(6) left=null, right=null]], right=(2) left=(3) left=null, right=null], right=(1) left=null, right=null]]]",
                newRoot.toString());
    }
}
