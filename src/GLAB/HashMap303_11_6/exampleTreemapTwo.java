package GLAB.HashMap303_11_6;

import java.util.TreeMap;

public class exampleTreemapTwo {

  public static void main(String[] args) {
    TreeMap<String, Integer> numbers = new TreeMap<>();
    numbers.put("First", 1);
    numbers.put("Second", 2);
    numbers.put("Third", 3);
    System.out.println("TreeMap: " + numbers);

    //Using the firstKey()
    String firstKey = numbers.firstKey();
    System.out.println("First key: " + firstKey);

    //Using the last key
    String lastKey = numbers.lastKey();
    System.out.println("Last key: " + lastKey);

    //Using First Entry
    System.out.println("First Entry: " + numbers.firstEntry());
    //Using Last Entry
    System.out.println("Last Entry: " + numbers.lastEntry());
  }
}
