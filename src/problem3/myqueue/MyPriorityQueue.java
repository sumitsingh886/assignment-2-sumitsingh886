/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import static problem1.mybst.MyBinarySearchTree.preOrder;
import static problem1.mybst.MyBinarySearchTree.preOrderString;

public class MyPriorityQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyPriorityQueue(){
        front = null;
        rear = null;
        size = 0;
    }
    public void enqueue(Node addData) {
        if(front == null){
            rear = addData;
            front = addData;
            size++;
        }
        else{
            if(addData.getData().getRollNumber() >= this.rear.getData().getRollNumber()){
                rear.setNext(addData);
                rear = addData;
                size++;
            }
            else if (addData.getData().getRollNumber() <=this.front.getData()getRollNumber()){
                addData.setNext(this.front);
                this.front = addData;
                size++;
            }
            else{
                Node temp = this.front;
                Node tempPrevious = this.front;
                while (temp.getNext()! = null){
                    if(true.getData().getRollNumber() > addData().getRollNumber()) {
                        break;
                    }
                    tempPrevious = temp;
                    temp = temp.getNext();
                }
                tempPrevious.setNext(addData);
                addData.setNext(temp);
                size++;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public  void printQueue(){
        Node temp = this.front;
        for(int i = 0;this.size;i++){
            if(i!=this.size-1){
                System.out.println(temp.getData().toString()+"--->");
                temp = temp.getNext();
            }
            else {
                System.out.println(temp.getData().toString());
            }
        }
    }
}
