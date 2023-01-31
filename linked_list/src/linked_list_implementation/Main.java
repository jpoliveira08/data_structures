package linked_list_implementation;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		/**
		 * Linkedlist as a Stack
		 */
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		linkedList.pop();
		
		System.out.println("LinkedList as Stack: " + linkedList);
		linkedList = new LinkedList<String>();
		
		/**
		 * Linkedlist as a Queue
		 */
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		linkedList.poll();
		
		System.out.println("LinkedList as Queue: " + linkedList);
		
		linkedList = new LinkedList<String>();
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		
		/**
		 * Adding a node between D and F
		 */
		linkedList.add(4, "E");
		
		/**
		 * Removing element from LinkedList
		 */
		linkedList.remove("E");
		
		/**
		 * Get the HEAD of LinkedList
		 */
		System.out.println(linkedList.peekFirst());
		
		/**
		 * Get the TAIL of LinkedList
		 */
		System.out.println(linkedList.peekLast());
		
		/**
		 * Set new HEAD element for the LinkedList
		 */
		linkedList.addFirst("0");
		
		/**
		 * Set new TAIL element for the LinkedList
		 */
		linkedList.addLast("G");
		
		/**
		 * Removing the first element of LinkedList
		 * And store into a variable
		 */
		String first = linkedList.removeFirst();
		
		/**
		 * Removing the las element of LinkedList
		 * And store into a variable
		 */
		String last = linkedList.removeLast();
	}
}
