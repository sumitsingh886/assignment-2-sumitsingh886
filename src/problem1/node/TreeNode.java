/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {
    private int key;
    private TreeNode left , right;

    public TreeNode(int item) {
        key = itm;
        left = right = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getRight(TreeNode right) {
        this.right = right;
    }
}
