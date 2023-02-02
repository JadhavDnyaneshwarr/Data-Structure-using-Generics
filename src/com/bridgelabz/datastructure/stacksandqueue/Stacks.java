package com.bridgelabz.datastructure.stacksandqueue;

import com.bridgelabz.datastructure.linkedlist.LinkedList;
import com.bridgelabz.datastructure.linkedlist.Node;

public class Stacks<T> {
    LinkedList<T> list;
    Stacks() {list = new LinkedList<>();}

    public void add (T data){
        list.add(data);
    }
    public void append (T data){
        list.append(data);
    }
    public void peek(){
        System.out.println("The first element of stack: " + list.head.data);
    }
    public void pop(){
        while (list.head != null) {
            peek();
            list.popFirst();
        }
        System.out.println("Stack is Empty");
    }
    public void display() {
        list.display();
    }
}
