public class Tester{
  public static void main(String[] args){
    TheMap<Integer, String> map = new TheMap<>();
    map.put(10,"yes"); 
    System.out.println(map.get(10));
  }
}
