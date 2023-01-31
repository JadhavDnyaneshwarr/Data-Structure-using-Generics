package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Data structure program using generics");
        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.add(70);
        linkedList1.add(30);
        linkedList1.add(56);
        linkedList1.display();
        System.out.println();

        LinkedList<Integer> linkedList2 = new LinkedList();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.display();
        System.out.println();

        LinkedList<Integer> linkedList3 = new LinkedList();
        linkedList3.append(70);
        linkedList3.append(56);
        linkedList3.display();
        linkedList3.insert(30, 56);
        linkedList3.display();
        System.out.println();

        LinkedList<Integer> linkedList4 = new LinkedList();
        linkedList4.append(70);
        linkedList4.append(30);
        linkedList4.append(56);
        linkedList4.display();
        System.out.println(linkedList4.popFirst());
        linkedList4.display();
        System.out.println();
    }
}
