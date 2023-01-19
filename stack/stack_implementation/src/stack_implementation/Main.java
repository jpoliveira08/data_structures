package stack_implementation;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		/**
		 * Adding elements to the stack
		 */
		stack.push("Javascript");
		stack.push("Python");
		stack.push("PHP");
		stack.push("Go");
		stack.push("Rust");
		
		/**
		 * Removing elements from the of stack
		 * 
		 * Returns the removed element
		 */
		String programmingLanguageRemoved = stack.pop();
		
		/**
		 * Get the element on the top of stack
		 * without removing it from the stack;
		 */
		String programmingLanguageOnTheTop = stack.peek();
		
		/**
		 * Getting the position of an item on the stack
		 * 
		 * Returns -1 if the element can't be found
		 */
		int positionOfPHPOnTheStack = stack.search("PHP");
		
		System.out.println(positionOfPHPOnTheStack);
	}
}
