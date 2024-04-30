package practice.division;

public class Division {

  public static void main(String[] args) {
    System.out.println("303 Practice SBA 1 Division\n");
    divisionString("824");
  }

  private static void divisionString(String str) {
    System.out.println("*********divisionString*********");

    char[] digitsArray = str.toCharArray();
    int result = Character.getNumericValue(digitsArray[0]);

    if (str.length() >= 2) {
      for (int i = 1; i < digitsArray.length; i++) {
        int currentDigit = Character.getNumericValue(digitsArray[i]);
        System.out.print(result + " / " + currentDigit);
        result = result / currentDigit;
        System.out.println(" = " + result);
      }
    }
    System.out.println("Final Result: " + result);
  }
}