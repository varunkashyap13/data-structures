package stacks;

public class Main {

	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<>();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
		
//		
//		String str = "hello";
//		
//		BalanceString balanced = new BalanceString();
//		System.out.println(balanced.isBalanced(str));
		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		
		System.out.println(stack.peek());
		
//		System.out.println("popped: " + stack.pop());
//		stack.print();
//		System.out.println("peek: " + stack.peek());
//		System.out.println("isEmpty: " + stack.isEmpty());
	}
}
