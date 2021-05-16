/*
Preorder Traversal (Practice):

Algorithm Preorder(tree)
   1. Visit the root.
   2. Traverse the left subtree, i.e., call Preorder(left-subtree)
   3. Traverse the right subtree, i.e., call Preorder(right-subtree)
Uses of Preorder
Preorder traversal is used to create a copy of the tree. Preorder traversal is also used to get prefix expression on of an expression tree. Please see http://en.wikipedia.org/wiki/Polish_notation to know why prefix expressions are useful.
Example: Preorder traversal for the above given figure is 1 2 4 5 3.
* */

package com.company;

public class PreorderTraversal {
    static class Node {
        int key;
        Node left, right;
        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        preorder(root);
    }
}
