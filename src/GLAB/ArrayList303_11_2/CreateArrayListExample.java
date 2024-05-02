package GLAB.ArrayList303_11_2;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

  public static void main(String[] args) {
    // Creación de un ArrayList de String
    List<String> animals = new ArrayList<>();

    // Agregar nuevos elementos al ArrayList
    animals.add("Lion");
    animals.add("Tiger");
    animals.add("Cat");
    animals.add("Dog");

    System.out.println(animals);

    // Agregar un elemento en un índice particular en un ArrayList
    animals.add(2, "Elephant");
    System.out.println(animals);
  }
}
