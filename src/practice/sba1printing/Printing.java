package practice.sba1printing;

public class Printing {

  public static void main(String[] args) {
    System.out.println("303 Practice SBA 1 Printing\n");
    printDigitsWithString("597");
    printDigitsWithCharacter("597");
  }

  private static void printDigitsWithString(String value){
    System.out.println("*********printDigitsWithString*********");
    for (int i = 0; i < value.length(); i++){
      System.out.println(value.charAt(i));
    }
    System.out.println();

  }

  private static void printDigitsWithCharacter(String value){
    System.out.println("*********printDigitsWithCharacter*********");
    char[] chars = value.toCharArray();
    for (int i = 0; i < chars.length; i++){
      System.out.println(chars[i]);
    }
    System.out.println();
  }
}
