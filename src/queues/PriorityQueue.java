package queues;

import java.util.Arrays;

public class PriorityQueue {
	//start from the back of the array
	//compare elements
	//place.
	//[10,20,30]
	//[30]
	//[20, 30]
	
	private int[] arr;
	private int count = 0;
	private int arrSize = 5;
	public PriorityQueue () {
		arr = new int[arrSize];
	}
	
	public void add(int item) {
		if (isFull()) {
			throw new IllegalStateException();
		}
		var i = shiftItemsToInsert(item);
		
		arr[i] = item;
		count++;
	}
	
	public boolean isFull() {
		return count == arr.length;
	}
	
	public int remove() {
		if (isEmpty()) {
			throw new IllegalStateException();
		}
		int result = arr[--count];
		arr[count] = 0;
		return result;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public int shiftItemsToInsert(int item) {
		int i;
		for (i = count - 1; i >= 0; i--) {
			if (arr[i] > item) {
				arr[i + 1] = arr[i];
			} else {
				break;
			}
		}
		return i + 1;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
}
