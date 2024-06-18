package listdemo;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to the queue
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        // Display contents of the queue.
        System.out.println("Elements of queue: " + q);

        // To remove the head of queue.
        int removedElement = q.remove();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue after removal: " + q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("Head of queue: " + head);

        // Rest all methods of collection interface like size and contains
        // can be used with this implementation.
        int size = q.size();
        System.out.println("Size of queue: " + size);
    }
}