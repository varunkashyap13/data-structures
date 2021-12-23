package stacks;

import java.util.Arrays;

public class Stack {
	private int[] stack;
	private int numItems = 0;
	private int arrSize = 5;
	public Stack(){
		stack = new int[arrSize];
	}
	
	public void push(int item) {
		if (numItems == arrSize){
			throw new StackOverflowError();
		}
		stack[numItems++] = item;
	}
	
	public int pop() {
		if (isEmpty()) {
			throw new IllegalStateException();
		} else {
			return stack[--numItems];
		}
	}
	
	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException();
		} else {
			return stack[numItems - 1];
		}
	}
	
	private boolean isEmpty() {
		return numItems < 1;
	}
	
	@Override
	public String toString() {
		var content = Arrays.copyOfRange(stack, 0, numItems);
		return Arrays.toString(content);
	}
}
