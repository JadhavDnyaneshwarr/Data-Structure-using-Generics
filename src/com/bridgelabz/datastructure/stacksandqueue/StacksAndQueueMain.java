package com.bridgelabz.datastructure.stacksandqueue;

public class StacksAndQueueMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Stacks and Queue Program");
        Stacks<Integer> stacks1 = new Stacks<>();
        stacks1.add(70);
        stacks1.add(30);
        stacks1.add(56);
        stacks1.display();
    }
}