package com.bridgelabz.datastructure.stacksandqueue;

import com.bridgelabz.datastructure.linkedlist.LinkedList;

public class Stacks<T> {
    LinkedList<T> list;
    Stacks() {list = new LinkedList<>();}

    public void add (T data){
        list.add(data);
    }
    public void append (T data){
        list.append(data);
    }
    public void display() {
        list.display();
    }
}
