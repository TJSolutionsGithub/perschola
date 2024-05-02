package PA.P10_3;

public class KidUser implements LibraryUser{
  int age;
  String bookType;

  public KidUser(int age, String bookType) {
    this.age = age;
    this.bookType = bookType;
  }

  /**
   * The methods in the KidUser class should perform the following logic. registerAccount: If age <=
   * 11, a message displaying “You have successfully registered under a Kids Account” should be
   * displayed in the console. If (age > 11), a message displaying, “Sorry, age must be less than 12
   * to register as a kid.” should be displayed in the console.
   */
  @Override
  public void registerAccount() {
    if (age <= 11) {
      System.out.println("You have successfully registered under a Kids Account.");
    } else {
      System.out.println("Sorry, age must be less than 12 to register as a kid.");
    }
  }

  /**
   * requestBook: If bookType is “Kids,” a message displaying “Book issued successfully, please
   * return the book within 10 days” should be displayed in the console. Else, a message displaying,
   * “Oops, you are allowed to take only kids books.” should be displayed in the console.
   */
  @Override
  public void requestBook() {
    if (bookType.equals("Kids")) {
      System.out.println("Book issued successfully, please return the book within 10 days.");
    } else {
      System.out.println("Oops, you are allowed to take only kids books.");
    }
  }
}
