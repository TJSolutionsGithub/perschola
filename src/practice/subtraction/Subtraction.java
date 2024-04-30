package practice.subtraction;

public class Subtraction {

  public static void main(String[] args) {
    System.out.println("303 Practice SBA 3 Subtraction\n");
    substractionString("824");
  }

  private static void substractionString(String str) {
    System.out.println("*********SubtractionString*********");

    char[] digitsArray = str.toCharArray();
    int result = Character.getNumericValue(digitsArray[0]);

    if (str.length() >= 2) {
      for (int i = 1; i < digitsArray.length; i++) {
        int currentDigit = Character.getNumericValue(digitsArray[i]);
        System.out.print(result + " - " + currentDigit);
        result = result - currentDigit;
        System.out.println(" = " + result);
      }
    }
    System.out.println("Final Result: " + result);
  }
}