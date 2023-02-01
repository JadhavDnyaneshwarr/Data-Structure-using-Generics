package com.bridgelabz.datastructure.linkedlist;

public class SortedLinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;

    public void sortLinkedList(T data){

        Node<T> newNode = new Node<>(data);
        Node<T> previousNode = null;
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            Node<T> temp = head;
            while (temp != null && temp.data.compareTo(data) < 0){
                previousNode = temp;
                temp = temp.next;
            }
            if (previousNode == null){
                newNode.next = head;
                head = newNode;
            }
            else {
                newNode.next = temp;
                previousNode.next = newNode;
            }
        }
    }
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
