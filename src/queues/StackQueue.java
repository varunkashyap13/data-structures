package queues;

import java.util.Stack;

public class StackQueue {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	public StackQueue() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	
	@Override
	public String toString() {
		return "StackQueue [stack1=" + stack1 + ", stack2=" + stack2 + "]";
	}

	public void enqueue(int item) {
		stack1.push(item);
	}
	
	public int dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException();
		}
		
		moveStack1ToStack2();
	
		return stack2.pop();
	}
	
	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
	
	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException();
		}
		
		moveStack1ToStack2();
	
		return stack2.peek();
	}

	private void moveStack1ToStack2() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
	}
}
