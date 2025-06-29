package org.example.theory.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack that holds Strings (generic type: String)
        Stack<String> stack = new Stack<String>();

        // Push elements onto the stack (LIFO: Last In, First Out)
        stack.push("banano");  // "banano" is added first
        stack.push("manzana"); // then "manzana"
        stack.push("uva");     // then "uva"
        stack.push("mango");   // finally "mango" is at the top of the stack

        // Pop (remove) the top element from the stack
        // Since "mango" was the last pushed, it's the first removed
        //stack.pop();


        // The peek() method returns the top element of the stack without removing it.
        if(!stack.isEmpty()){
            // prevent the execution error EmptyStackException
            System.out.println(stack.peek());
        }

        System.out.println(stack.search("manzana")); // return the position


        System.out.println(stack); //show all the elements


        /*  USES OF STACKS
            - undo/redo features in text editors
            - moving back/forward through browser history
            - backtracking algorithms (maze, file directories)
            - calling functions (call stack)
         */

    }

}