package linkedLists;

import java.util.NoSuchElementException;

public class LinkedList {
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node first;
	private Node last;
	private int size;
	
	public void addFirst(int item) {
		var node = new Node(item);
		
		if (isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
		size++;
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	
	public void addLast(int item) {
		var node = new Node(item);
		
		if (isEmpty()) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
		size++;
	}
	
	public void removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		
		if (first == last) {
			first = last = null;
		} else {
			var second = first.next;
			first.next = null;
			first = second;
			size--;			
		}
		size--;
	}
	
	public void removeLast() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		if (first == last) {
			first = last = null;
		} else {
			var previous = getPrevious(last);
			last = previous;
			last.next = null;
		}
		size--;
		}
	
	private Node getPrevious (Node node) {
		var current = first;
		while (current != null) {
			if (current.next == node) {
				return current;
			} else {
				current = current.next;
			}
		}
		return null;
	}
	
	public boolean contains(int item) {
		return indexOf(item) != -1;
	}
	
	public int indexOf(int item) {
		int index = 0;
		var current = first; 
		while (current != null) {
			if (current.value == item) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}
	
	public int size() {
		return size;
	}
	
	public int[] toArray() {
		int[] array = new int[size];
		var current = first;
		var index = 0;
		while (current != null) {
			array[index++] = current.value;
			current = current.next;
		}
		return array;
	}
	
	public void reverse() {
		if (isEmpty()) {
			return;
		}
		
		var previous = first;
		var current = first.next;
		
		while (current != null) {
			var next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		last = first;
		last.next = null;
		first = previous;
	}
	
	public int getKthFromTheEnd(int k) {
		if (size < k || k == 0) {
			return -1;
		}
		
		var fPointer = first;
		for (int i = 0; i < k -1; i++) {
			fPointer = fPointer.next;
		}
		var lPointer = first;
		
		while (fPointer != last) {
			fPointer = fPointer.next;
			lPointer = lPointer.next;
		}
		return lPointer.value;
	}
	
	public void print() {
		var current = first; 
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public void printMiddle() {
		var slow = first;
		var fast = first;
		
		while (fast != last && fast.next != last) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		if (fast == last) {
			System.out.println(slow.value);
		} else {
			System.out.println(slow.value + "," + slow.next.value);
		}
	}
}