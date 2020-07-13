package map;

public class Node<K,V> {
  final K key;
  V value;
  Node<K,V> next;

  Public Entry(K key, V value, Entry<K, V> next) {
    this.key = key;
    this.value = value;
    this.next = next;
  }

  public String toString(){
    return "" + V + K;
  }
}
