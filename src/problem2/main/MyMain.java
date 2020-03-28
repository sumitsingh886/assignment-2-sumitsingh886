/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import  problem1.mybst.MyBinarySearchTree;

import  java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner sc = mew Scanner(System.in);
        int i =7;
        while(i>0){
            tree.add(sc.nextInt());
            i--;
        }
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }
}
