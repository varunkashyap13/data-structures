package hashMaps;

import java.util.Arrays;
import java.util.LinkedList;




public class HashTable {
	private LinkedList<Entry>[] entries = new LinkedList[5];
	
	@Override
	public String toString() {
		return "HashTable [arr=" + Arrays.toString(entries) + "]";
	}
	
	public void put (int key, String value) {
		Entry<Integer, String> pair = Entry.getPair(key, value);
		
		var entry = getEntry(key);
		if (entry != null) {
			entry.setValue(value);
			return;
		}

		getOrCreateBucket(key).addLast(pair);
	}
	
	public String get(int key) {
		var entry = getEntry(key);
		
		return (entry == null) ? null : (String)entry.getValue();
	}
	
	public Entry getEntry(int key) {
		var bucket = getBucket(key);
		if (bucket != null) {
			for (var entry : bucket) {
				if ((int)entry.getKey() == key) {
					return entry;
				}
			}
		} 
		return null;
	}
	
	private LinkedList<Entry> getOrCreateBucket(int key) {
		var index = hash(key);
		var bucket = entries[index];
		if (bucket == null) {
			entries[index] = new LinkedList<>();
		}
		
		return bucket;
	}
	
	public void remove(int key) {
		var entry = getEntry(key);
		
		if (entry == null) {
			throw new IllegalStateException();
		}
		getBucket(key).remove(entry);
	}
	
	private LinkedList<Entry> getBucket(int key) {
		return entries[hash(key)];
	}
	
	private int hash(int key) {
		return key % entries.length;
	}
}

