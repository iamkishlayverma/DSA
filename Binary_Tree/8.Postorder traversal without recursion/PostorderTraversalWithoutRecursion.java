package com.company;

import java.util.Stack;

public class PostorderTraversalWithoutRecursion {
    static class Node {
        int key;
        Node left, right;
        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public static void postorderWithoutRecursion(Node root) {
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while (true) {
            while (curr != null) {
                s.push(curr);
                s.push(curr);
                curr = curr.left;
            }
            if (s.isEmpty()) {
                return;
            }
            curr = s.pop();
            if (!s.isEmpty() && curr == s.peek()) {
                curr = curr.right;
            } else {
                System.out.print(curr.key + " ");
                curr = null;
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
        postorderWithoutRecursion(root);
    }
}
