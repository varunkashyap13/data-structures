package hashMaps;

import java.util.HashSet;
import java.util.Set;

public class RepeatChar {
	Set<Character> set = new HashSet<>();
	
	public Character getFirstRepeatChar(String str) {
		for (char ch : str.toCharArray()) {
			if (set.contains(ch)) {
				return ch;
			}
			set.add(ch);
		}
		return Character.MIN_VALUE;
		
	}
}
