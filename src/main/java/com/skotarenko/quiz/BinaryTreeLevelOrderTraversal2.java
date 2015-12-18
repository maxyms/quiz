package com.skotarenko.quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

 * @author maxyms
 *
 */
public class BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        addToLevel(res, 0, root);
        return res;
    }

    private void addToLevel(List<List<Integer>> res, int level, TreeNode node) {
        int nextLevel = level + 1;
        if (node.left != null) {
            addToLevel(res, nextLevel, node.left);
        }
        if (node.right != null) {
            addToLevel(res, nextLevel, node.right);
        }
        if (res.size() < level || res.get(level) == null) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);
    }
}
