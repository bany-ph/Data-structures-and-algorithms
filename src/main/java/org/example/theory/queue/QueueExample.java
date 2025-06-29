package org.example.theory.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    static Queue<Integer> queue;
     static void linkedListQueue(){
         queue = new LinkedList<Integer>();
         //add
         queue.offer(8);
         queue.offer(2);
         queue.offer(3);
         queue.offer(1);
         queue.offer(6);

            //remove
//         system.out.println(queue.poll()); //It will remove and return the first element ("a")
//

//         System.out.println(queue.isEmpty()); // check if is empty
//         System.out.println(queue.size()); // return the total of elements ()
//         System.out.println(queue.peek()); // it will show the first element
//         System.out.println(queue.contains(2)); // true
//         System.out.println(queue.contains(10)); // false

     }
     static void priorityQueue(){
         /*
            A FIFO structures that server elements with the highest priorities first.

          */
            queue = new PriorityQueue<Integer>();
         //add
         queue.offer(8);
         queue.offer(2);
         queue.offer(3);
         queue.offer(1);
         queue.offer(6);
     }
    public static void main(String[] args) {
        /*
            Queue = FIFO data structure. First-In First-Out
            A collection designed for holding element prior to processing
            Linear data structure

            add = enqueue, offer()
            remove = dequeue, poll()



            USES OF QUEUES - useful:
            - keyboard Buffer (Letters should appear on the screen in the order they are pressed)
            - Printer Queue (Print jobs should be completed in order)
            - Used in LinkedList, PriorityQueues, Breadth-first search
         */

        System.out.println(" - LinkedList - ");
        linkedListQueue();
        System.out.println(queue);


        System.out.println(" - PriorityQueue - ");
        priorityQueue();
        System.out.println(queue);
    }
}
