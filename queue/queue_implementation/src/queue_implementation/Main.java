package queue_implementation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		/**
		 * We cannot instantiate the type Queue
		 * So we have to work with Linked List
		 */
		Queue<String> queue = new LinkedList<String>();
		
		/**
		 * Adding elements in the queue
		 */
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		/**
		 * Getting the first of the queue 
		 */
		System.out.println(queue.peek());
		
		/**
		 * Getting the size of our queue
		 */
		System.out.println(queue.size());
		
		/**
		 * Checking if an element exists in our queue
		 * 
		 * Returns boolean
		 */
		System.out.println(queue.contains("Harold"));
		
		/**
		 * Removing elements from the head of our queue
		 */
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		
		/**
		 * Checking if the queue is empty
		 */
		System.out.println(queue.isEmpty());
	}
}
