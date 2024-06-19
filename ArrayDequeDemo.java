//Program to demonstrate ArrayDeque

package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Lion");
		dq.add("Tiger");
		dq.add("Monkey");

		// offerFirst-adds elements at the front of the ArrayDeque
		dq.offer("F");

//		dq.addFirst("Raj");
//		dq.addFirst("Shaym");
		dq.addLast("Last");
		
		// arrayDeque.add(null);
//		dq.offerFirst("D");
		// offerLast inserts the element at the last of ArrayDeque
		dq.offerLast("E");

		Iterator<String> itr = dq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After poll");
		String s = dq.poll();
		System.out.println("Poll Item is:" + s);

		for (String item : dq) {
			System.out.println(item);
		}
	}
}