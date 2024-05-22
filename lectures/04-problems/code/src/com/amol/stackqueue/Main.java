package com.amol.stackqueue;

public class Main {
    public static void main(String[] args) {
        QueueUsingStacksRemoveEfficient queue = new QueueUsingStacksRemoveEfficient();

        try {
            // Adding elements to the queue
            queue.add(1);
            queue.add(2);
            queue.add(3);

            // Removing and printing elements from the queue
            System.out.println("Removed element: " + queue.remove()); // Outputs 1
            System.out.println("Removed element: " + queue.remove()); // Outputs 2

            // Peeking at the next element in the queue
            System.out.println("Peeked element: " + queue.peek()); // Outputs 3

            // Removing the remaining elements from the queue
            System.out.println("Removed element: " + queue.remove()); // Outputs 3
            System.out.println("Queue is empty: " + queue.isEmpty()); // Outputs true
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
