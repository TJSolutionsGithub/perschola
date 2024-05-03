package GLAB.HashMap303_11_6;

import java.util.HashMap;

public class ExampleOneHashMap {

  public static void main(String[] args) {
    HashMap<Integer, String> languajes = new HashMap<>();
    languajes.put(1, "Java");
    languajes.put(2, "Python");
    languajes.put(3, "JavaScript");
    languajes.put(4, "C Sharp");

    System.out.println("HashMap: " + languajes);

    //remove element associated with key 2
    String value = languajes.remove(2);
    System.out.println("Removed value: " + value);
    System.out.println("Updated HashMap: " + languajes);
  }
}
