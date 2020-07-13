public class Node<K,V> {
  final K key;
  V value;
  Node<K,V> next;

  public Node(K key, V value, Node<K, V> next) {
    this.key = key;
    this.value = value;
    this.next = next;
  }

  public String toString(){
    return "" + this.key+" "+ this.value;
  }
}
