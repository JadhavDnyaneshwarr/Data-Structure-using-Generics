package com.bridgelabz.datastructure.stacksandqueue;

public class StacksAndQueueMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Stacks and Queue Program");
        Stacks<Integer> stacks1 = new Stacks<>();
        stacks1.add(70);
        stacks1.add(30);
        stacks1.add(56);
        stacks1.display();
        System.out.println();
        Stacks<Integer> stacks2 = new Stacks<>();
        stacks2.add(70);
        stacks2.add(30);
        stacks2.add(56);
        stacks2.display();
        stacks2.pop();
        System.out.println();
        Queue<Integer> Queue1 = new Queue<>();
        Queue1.append(56);
        Queue1.append(30);
        Queue1.append(70);
        Queue1.display();
        System.out.println();
        Queue<Integer> Queue2 = new Queue<>();
        Queue2.append(56);
        Queue2.append(30);
        Queue2.append(70);
        Queue2.display();
        Queue2.pop();
        System.out.println();
    }
}