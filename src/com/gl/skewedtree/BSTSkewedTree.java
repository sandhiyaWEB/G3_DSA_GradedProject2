package com.gl.skewedtree;

public class BSTSkewedTree {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void BSTToSkewed(Node root) {
		if (root == null) {
			return;
		}
		BSTToSkewed(root.left);
		Node rightNode = root.right;
		Node leftNode = root.left;
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		BSTToSkewed(rightNode);
	}

	static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

}
