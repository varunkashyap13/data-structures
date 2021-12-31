package hashMaps;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		//Key: employee number (Integer)
		//Value: Name (string)
		
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "Daren");
//		map.put(2, "Mary");
//		map.put(2, "Varun");
//		map.put(null, null);
//		map.remove(null);
//		var value = map.get(2);
//		System.out.println(map);
//		System.out.println(value);
//		
//		map.containsKey(3); //O(1)
//		map.containsValue("Varun"); //O(n)
//		
//		for(var item : map.keySet()) {
//			System.out.println(item);
//		}
//		
//		for(var item : map.entrySet()) {
//			System.out.println(item);
//		}
		
		
		//get first non-repeat character
//		String str = "agrenp";
////		Repeat repeat = new Repeat();
//		
//		RepeatChar repeat = new RepeatChar();
//		System.out.println(repeat.getFirstRepeatChar(str));
		
		
		HashTable table = new HashTable();
		table.put(6, "A");
		table.put(8, "B");
		table.put(11, "C");
		System.out.println(table);
		System.out.println(table.get(11));
		
		table.remove(6);
		System.out.println(table);
		table.remove(6);
		System.out.println(table);
	}
}
