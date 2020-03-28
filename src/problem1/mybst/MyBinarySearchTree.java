/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

public class MyBinarySearchTree {
    public static StringBuilder preOrderString;
    static int levels = 0;
    public TreeNode root;

    public MyBinarySearchTree(){
        this.root = null;
        preOrderString = new StringBuilder();
    }

    public  void  add(final int value) {
        this.root = newService(this.root,value);
    }

    public TreeNode addService(final TreeNode treeRoot,final int addingValue) {
        if (treeRoot == null) {
            return new TreeNode(addingValue);
        }
        if (addingValue < treeRoot.getKey()) {
            treeRoot.setLeft(addService(treeRoot.getLeft(),addingValue));
        } else if (addingValue == treeRoot.getKey()) {
            return treeRoot;
        } else {
            treeRoot.setRight(addService(treeRoot.getRight(), addingValue));
        }
        return treeRoot;
    }
    public static void preOrder(TreeNode root) {
        if(root == null)
        {
            return;;
        }
        preOrderString.append(root.getKey()+" ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
}
