package queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
//		Queue<Integer> queue = new ArrayDeque<>();
//		queue.add(10);
//		queue.add(20);
//		queue.add(30);
//		
//		reverse(queue);
//		System.out.println(queue);
		
//		ArrayQueue aq = new ArrayQueue(5);
//		aq.enqueue(10);
//		aq.enqueue(20);
//		aq.enqueue(30);
//		System.out.println(Arrays.toString(aq.toArray()));
//		
//		aq.dequeue();
//		aq.dequeue();
//		aq.dequeue();
//		System.out.println(Arrays.toString(aq.toArray()));
		
//		StackQueue queue = new StackQueue();
//		queue.enqueue(10);
//		queue.enqueue(20);
//		queue.enqueue(30);
//		queue.enqueue(40);
//		
//		System.out.println(queue.toString());
//		
//		System.out.println(queue.dequeue());
//		System.out.println(queue.toString());
		
		PriorityQueue queue = new PriorityQueue();
		queue.add(5);
		queue.add(3);
		queue.add(5);
		queue.add(1);
		queue.add(4);
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		
	}
	
	public static void reverse(Queue<Integer> input) {
		//[10, 20, 30]
		//[30, 20, 10]
		if (input.isEmpty()) {
			throw new IllegalStateException();
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		while (!input.isEmpty()) {
			stack.push(input.remove());
		}
		while (!stack.isEmpty()) {
			input.add(stack.pop());
		}
	}

}
