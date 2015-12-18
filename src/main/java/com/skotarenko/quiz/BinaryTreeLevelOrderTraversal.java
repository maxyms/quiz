package com.skotarenko.quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

    For example:
    Given binary tree {3,9,20,#,#,15,7},
        3
       / \
      9  20
        /  \
       15   7
    return its level order traversal as:
    [
      [3],
      [9,20],
      [15,7]
    ]

 * @author maxyms
 *
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        int level = 0;
        res.add(level, new ArrayList<>());
        res.get(level).add(root.val);
        addToLevel(root.left, root.right, ++level, res);
        return res;
    }

    private void addToLevel(TreeNode left, TreeNode right, int level, List<List<Integer>> res) {
        if (left == null && right == null) {
            return;
        }
        List<Integer> resLevel = null;
        int nextLevel = level + 1;
        if (res.size() <= level) {
            resLevel = new ArrayList<>();
            res.add(level, resLevel);
        } else {
            resLevel = res.get(level);
        }
        if (left != null) {
            resLevel.add(left.val);
            addToLevel(left.left, left.right, nextLevel, res);
        }
        if (right != null) {
            resLevel.add(right.val);
            addToLevel(right.left, right.right, nextLevel, res);
        }
    }
}
