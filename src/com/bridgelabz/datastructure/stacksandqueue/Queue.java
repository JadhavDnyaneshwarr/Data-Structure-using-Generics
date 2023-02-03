package com.bridgelabz.datastructure.stacksandqueue;

import com.bridgelabz.datastructure.linkedlist.LinkedList;

public class Queue<T> {

    LinkedList<T> list;
    Queue() {list = new LinkedList<>();}

    public void append (T data){
        list.append(data);
    }
    public void display() {
        list.display();
    }
}
