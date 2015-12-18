package com.skotarenko.quiz;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        return invertNode(root);
    }

    private TreeNode invertNode(TreeNode node) {
        if (node == null) {
            return node;
        }
        TreeNode newNode = new TreeNode(node.val);
        newNode.left = invertNode(node.right);
        newNode.right = invertNode(node.left);
        return newNode;
    }
}
