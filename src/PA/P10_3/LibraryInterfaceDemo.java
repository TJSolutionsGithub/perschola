package PA.P10_3;

public class LibraryInterfaceDemo {

  public static void main(String[] args) {
    System.out.println("********** Test case 1 **********\n");
    KidUser kid1 = new KidUser(10, "Kids");
    KidUser kid2 = new KidUser(18, "Fiction");

    kid1.registerAccount();
    kid2.registerAccount();
    System.out.println("----------------------");

    kid1.requestBook();
    kid2.requestBook();

    System.out.println("********** Test case 2 **********\n");
    AdultUser adult1 = new AdultUser(5, "Kids");
    AdultUser adult2 = new AdultUser(23, "Fiction");

    adult1.registerAccount();
    adult2.registerAccount();
    System.out.println("----------------------");

    adult1.requestBook();
    adult2.requestBook();
  }
}
