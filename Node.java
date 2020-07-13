public class Node<K,V> {
  final K key;
  V value;
  Node<K,V> next;

  Public Entry(K key, V value, Entry<K, V> next) {
    this.key = key;
    this.value = value;
    this.next = next;
  }

  public K GetKey() {
    return this.key;
  }

  public V GetValue() {
    return this.value();
  }

  public String toString(){
    return "" + V + K;
  }
}
