package GLAB.Generics303_11_1;

public class DemoClass {
  // Create generics method
  public <T> void genericsMethod(T data) {
    System.out.println("Generics Method");
    System.out.println("Data Passed: "+data);
  }
}
