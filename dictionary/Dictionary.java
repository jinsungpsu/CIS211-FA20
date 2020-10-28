public interface Dictionary<K extends Comparable<K>, V> {
    public V search(K key);

    // we could return boolean true if the item was succesfully removed
    public void remove(K key);

    public void insert(K key, V value);
}
