package org.example.theory.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();


        //linked list as a queue
        /*
        linkedList.offer("potato"); // Adds an element to the end (as a Queue).
        linkedList.offer("apple");
        linkedList.offer("apple");
        linkedList.offer("orange");*/

        //linked list as a Stack
        linkedList.push("tomato"); // push() Adds an element to the beginning of the list
        linkedList.push("pear");
        linkedList.push("apple");
        linkedList.push("orange");


        linkedList.add(4,"watermelon"); // Inserts element at a specific position.
        linkedList.addFirst("banana");
        linkedList.addLast("papaya");
        linkedList.remove("orange");
        System.out.println(linkedList.indexOf("apple"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());


        System.out.println("Size: "+linkedList.size());


        System.out.println("\nShowing all the fruits: " + String.join(", ", linkedList));
        String searchVocalFruit = "p";
        System.out.println("\nShowing fruits that start with -> " +  searchVocalFruit);
        linkedList.stream().filter(letter -> letter.startsWith(searchVocalFruit)).forEach(System.out::println);



    }
}
