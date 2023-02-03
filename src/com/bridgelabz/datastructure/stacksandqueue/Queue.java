package com.bridgelabz.datastructure.stacksandqueue;

import com.bridgelabz.datastructure.linkedlist.LinkedList;

public class Queue<T> {

    LinkedList<T> list;
    Queue() {list = new LinkedList<>();}

    public void append (T data){
        list.append(data);
    }
    public void pop(){
        while (list.head != null) {
            System.out.println("head of Queue: " + list.head.data);
            list.popFirst();
            display();
        }
        System.out.println("Queue is Empty");
    }
    public void display() {
        list.display();
    }
}
