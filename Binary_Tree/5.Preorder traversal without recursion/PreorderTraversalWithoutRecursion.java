package com.company;

import java.util.Stack;

public class PreorderTraversalWithoutRecursion {
    static class Node {
        int key;
        Node left, right;
        Node (int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorderWithoutRecursion(Node root) {
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while (!s.isEmpty() || curr != null) {
            while (curr != null) {
                System.out.print(curr.key + " ");
                s.push(curr);
                curr = curr.left;
            }
            Node temp = s.pop();
            curr = temp.right;
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
        preorderWithoutRecursion(root);
    }
}
