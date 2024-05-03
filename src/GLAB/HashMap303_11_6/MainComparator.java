package GLAB.HashMap303_11_6;

import java.util.TreeMap;

public class MainComparator {

  public static void main(String[] args) {
    TreeMap<String, Integer> map = new TreeMap<>(new CustomComparator());
    map.put("First", 1);
    map.put("Second", 2);
    map.put("Third", 3);
    map.put("Fourth", 4);

    System.out.println("TreeMap: " + map);
  }
}
