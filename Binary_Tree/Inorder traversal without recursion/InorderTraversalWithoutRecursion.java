package com.company;

import java.util.Stack;

public class InorderTraversalWithoutRecursion {
    static class Node {
        int key;
        Node left, right;
        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorderWithoutRecursion(Node root) {
        Stack<Node> s = new Stack<>();
        Node current = root;
        while (!s.isEmpty() || current != null) {
            while (current != null) {
                s.push(current);
                current = current.left;
            }
            Node temp = s.pop();
            System.out.print(temp.key + " ");
            current = temp.right;
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
        inorderWithoutRecursion(root);
    }
}
