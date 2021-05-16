package com.company;

public class InorderTraversalWithoutRecursionWithoutStack {
    static class Node {
        int key;
        Node left, right;
        Node (int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorderWithoutRecursionWithoutStack (Node root) {
        Node curr = root;
        while (curr != null) {
            if (curr.left == null) {
                System.out.print(curr.key + " ");
                curr = curr.right;
            } else {
                Node prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    prev.right = null;
                    System.out.print(curr.key + " ");
                    curr = curr.right;
                }
            }
        }
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        inorderWithoutRecursionWithoutStack(root);
    }
}
