/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1, "A", 1, 0));
        studentList.add(new Student(2, "B", 2, 2));
        studentList.add(new Student(3, "C", 1, 1));
        studentList.add(new Student(4, "D", 2, 2));
        studentList.add(new Student(5, "E", 0, 0));
        studentList.add(new Student(6, "F", 2, 1));
        studentList.add(new Student(7, "G", 1, 1));
        studentList.add(new Student(8, "H", 2, 1));
        studentList.add(new Student(9, "I", 0, 0));
        studentList.add(new Student(10, "J", 0, 0));
        studentList.add(new Student(11, "K", 2, 1));
        MyCircularQueue studentqueue = new MyCircularQueue();
        studentqueue.enqueue(studentList);
        studentqueue.printQueue();
    }
}
