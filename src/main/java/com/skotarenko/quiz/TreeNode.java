package com.skotarenko.quiz;

/**
 * Helper class for BinaryTree problems
 * 
 * @author maxyms
 *
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "(" + val + ") left=" + left + ", right=" + right + "]";
    }
}