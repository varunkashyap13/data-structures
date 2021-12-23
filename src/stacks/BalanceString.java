package stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalanceString {
	private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
	private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');
	
	public boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();
		for (char ch : input.toCharArray()) {
			if (isLeft(ch)) {
				stack.push(ch);
			}
			if (isRight(ch)) {
				if (stack.empty()) {
					return false;
				}
				var top = stack.pop();
				if (match(top, ch)) {
					return false;
				}
			}
		}
		
		return stack.empty();
	}
	
	private boolean isLeft(char ch) {
		return leftBrackets.contains(ch);
	}
	
	private boolean isRight(char ch) {
		return rightBrackets.contains(ch);
	}
	
	private boolean match(char left, char right) {
		return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
	}
}
