package hashMaps;

public class Entry<K,V> {
	
	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}

	public K key;
	public V value;
	
	private Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public static <K, V> Entry <K, V> getPair(K key, V value) {
		return new Entry<>(key, value);
	}
	
	public K getKey() {
		return key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public V getValue() {
		return value;
	}
}
