public class TheMap<K,V>{
  private Node<K,V>[] map;
  private static final int INITIAL_CAPACITY = 16; 

  private int size = 0;

  public TheMap() {
    this(INITIAL_CAPACITY);
  }

  public TheMap(int capacity) {
    this.map = new Node[capacity];
    size = capacity;
  }

  public int getSize(){
    return this.size;
  }

  private int  getHash(K key){
    return key.hashCode();
  }

  public void put(K key, V value){
    Node<K,V> entry = new Node<>(key, value, null);

    int code = getHash(key) % getSize();
    Node<K,V> existing = map[code];    
    if(existing== null){
      map[code] = entry;
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
