package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
		public static void main(String[] args) {
			Queue <Integer> qu = new PriorityQueue<Integer>();
			
			qu.add(23);
			qu.add(34);
			qu.add(2);
			qu.offer(0);
			
			qu.forEach(q1 -> System.out.println(q1));
			
			qu.remove(23);
			System.out.println(qu);
			
		}
}
