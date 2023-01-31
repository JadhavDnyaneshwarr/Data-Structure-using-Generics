package com.bridgelabz.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void add(T data){
        Node<T> newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void append(T data){
        Node<T> newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public Node<T> search(T searchData){
        Node<T> temp = head;
        Boolean found = true;
        while (temp != null){
            if (temp.data.equals(searchData)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public Boolean insert(T insertData, T searchData) {
        Node<T> searchedData = search(searchData);
        if (searchedData != null){
            Node<T> newNode = new Node<>(insertData);
            Node<T> nextNode= searchedData.next;
            searchedData.next = newNode;
            newNode.next = nextNode;
            return true;
        }
        return false;
    }
    public T popFirst() {
        T popData = head.data;
        head = head.next;
        return popData;
    }
    public T popLast() {
        T popData = tail.data;
        Node<T> temp = head;
        while (temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popData;
    }

    public void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
