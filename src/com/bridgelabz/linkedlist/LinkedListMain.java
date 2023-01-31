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

        LinkedList<Integer> linkedList5 = new LinkedList();
        linkedList5.add(70);
        linkedList5.add(30);
        linkedList5.add(56);
        linkedList5.display();
        System.out.println(linkedList5.popLast());
        linkedList5.display();
        System.out.println();

        LinkedList<Integer> linkedList6 = new LinkedList();
        linkedList6.add(70);
        linkedList6.add(30);
        linkedList6.add(56);
        linkedList6.display();
        if (linkedList6.search(30) == null){
            System.out.println("element is not found in Linked List");
        }else {
            System.out.println("element is found in Linked List");
        }
        System.out.println();

        LinkedList<Integer> linkedList7 = new LinkedList();
        linkedList7.add(70);
        linkedList7.add(30);
        linkedList7.add(56);
        linkedList7.display();
        if (linkedList7.insert(40, 30) == true){
            System.out.println("element is insert in Linked List");
        }else {
            System.out.println("element is not insert in Linked List");
        }
        linkedList7.display();
        System.out.println();
    }
}
