/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;

import problem1.mybst.MyBinarySearchTree;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new    MyBinarySearchTree();
        Scanner sc = new Scanner(System.in);
        int i =7;
        while(i>0){
            tree.add(sc.nextInt());
            i--;
        }
    }
}
