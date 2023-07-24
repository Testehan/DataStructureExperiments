package com.testehan.datastructures.tree;

public class TreeExperiments {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("root");
        TreeNode child1 = new TreeNode("child1");
        TreeNode child2 = new TreeNode("child2");
        root.addChild(child1);
        root.addChild(child2);

        TreeNode child11 = new TreeNode("child11");
        TreeNode child12 = new TreeNode("child12");
        child1.addChild(child11);
        child1.addChild(child12);

        System.out.println(root.print(0));

    }
}
