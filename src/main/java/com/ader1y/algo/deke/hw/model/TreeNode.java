package com.ader1y.lcquestion.model;

import com.ader1y.lcquestion.important.PreorderTraversal;
import com.google.common.collect.Lists;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author: zhan yan
 * @date: 2023/6/23
 */
public class TreeNode {

    private static final Logger LOG = LoggerFactory.getLogger(TreeNode.class);

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode buildTree(List<Integer> treeList) {
        if (treeList == null || treeList.isEmpty()) {
            return null;
        }

        Queue<TreeNode> q1 = new LinkedList<>();
        for (Integer i : treeList) {
            q1.add(new TreeNode(i));
        }
        Queue<TreeNode> q2 = new LinkedList<>(q1);
        TreeNode root = q2.poll();

        for (TreeNode node : q1) {
            node.left = q2.poll();
            node.right = q2.poll();
        }
        assert root != null;
        LOG.info("root node is: {}", root.val);

        return root;
    }

    public static void main(String[] args) {
        List<Integer> treeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            treeList.add((int) (Math.random() * 20));
        }
        LOG.info(treeList.toString());
        TreeNode.buildTree(treeList);
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left.val +
                ", right=" + right.val +
                '}';
    }
}
