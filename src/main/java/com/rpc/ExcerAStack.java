package com.rpc;

import java.util.Stack;

public class ExcerAStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");

        System.out.println(animals);

        // if you want to get first element on top
        // we have peek method in stack
        var animal = animals.peek();
        System.out.println(animal+" at top");

        System.out.println("after peek");
        System.out.println(animals);

        animal = animals.pop();
        // I believe time complexity would be O(1) as everytime element will
        // be removed from last index
        // confimed
        /**
         * In Java, the pop() method in a stack typically has a time complexity of O(1).
         * This constant time complexity means that regardless of the size of the stack,
         * removing an element from the top of the stack takes a constant amount of time. This is because stacks usually implement their operations using a linked list or an array, allowing direct access to the top element for removal.
         */
        System.out.println(animal+" poped");

        System.out.println("after poping one element");
        System.out.println(animals);

        /**
         * [Lion, Dog, Horse]
         * Horse at top
         * after peek
         * [Lion, Dog, Horse]
         * Horse poped
         * after poping one element
         * [Lion, Dog]
         */
    }
}
