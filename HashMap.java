package Map;

public class HashMap.java {
  private Node<K,V>[] map;
  private static final int INITIAL_CAPACITY = 1 << 4; //16

  private int size = 0;

  public HashMap() {
    this(INITIAL_CAPACITY);
  }

  public HashMap(int capacity) {
    this.map = new Node[capacity];
  }

  public getSize(){
    return this.size;
  }

  private getHash(K key){
    return key.hashCode();
  }

  public void put(K key, V value){
    Node<K,V> entry = new Node<>(key, value, null);

    int code = getHash(key) % getSize();

    if(map[code] == null){
      maps[code] = entry;
      size ++;  
    } else {
      while (existing.next != null) {
        if(existing.key.equals(key)){
          existing.value = value;
          return;
        }
        existing = existing.next;
      }

      if(existing.key.equals(key)){
        existing.value = value;
      } else {
        existing.next = entry;
        size++;
      }
    }
  }
  
  public V get(K key){
    Node<K,V> val = map[getHash(key) % getSize()];

    while(val != null) {
      if(val.key.equals(key)){
        return val.value;
      }
      val = val.next;
    } 
    return null;
  }
}
