package hashtable;

public class hashNode<K,V> {
    private final K key;
    private final V value;
    private  final Integer hashCode;
    private  hashNode next;

    public hashNode(K key, V value, Integer hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Integer getHashCode() {
        return hashCode;
    }


    public hashNode<K, V> getNext() {
        return next;
    }

    public void setNext(hashNode<K, V> next) {
        this.next = next;
    }
}
