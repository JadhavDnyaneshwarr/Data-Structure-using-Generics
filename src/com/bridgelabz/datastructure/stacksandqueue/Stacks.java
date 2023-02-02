package com.bridgelabz.datastructure.stacksandqueue;

import com.bridgelabz.datastructure.linkedlist.LinkedList;
import com.bridgelabz.datastructure.linkedlist.Node;

public class Stacks<T> {
    LinkedList<T> list;
    Stacks() {list = new LinkedList<>();}

    public void display() {
        list.display();
    }
}
