package glab303_10_4;

public class myRunner {

  public static void main(String[] args) {

    Circle c1 = new Circle(1, 2, 2);
    System.out.println("Area of Circle " + c1.getArea());
    System.out.println("Coordinates are " + c1.getCoordinate());

    c1.moveDown();
    System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

    c1.moveRight();
    System.out.println("After move right, Coordinates are " + c1.getCoordinate());

    c1.moveUp();
    System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

    c1.moveLeft();
    System.out.println("After move left, Coordinates are " + c1.getCoordinate());


    System.out.println("--------Test Polymorphism-------");
    Movable c2 = new Circle(5, 10, 200);  // upcast
    c2.moveUp();
    System.out.println("After move up , Coordinates are " + c2.getCoordinate());

    c2.moveLeft();
    System.out.println("After move Left , Coordinates are " + c2.getCoordinate());

    System.out.println("--------Rectangle-------");
    // Rectangle Test
    Rectangle r1 = new Rectangle(3, 4, 5.0, 6.0);
    System.out.println("Area of Rectangle: " + r1.getArea());
    System.out.println("Coordinates of Rectangle: " + r1.getCoordinate());

    r1.moveDown();
    System.out.println("After move Down, Coordinates are: " + r1.getCoordinate());

    r1.moveRight();
    System.out.println("After move right, Coordinates are: " + r1.getCoordinate());

    r1.moveUp();
    System.out.println("After move Up, Coordinates are: " + r1.getCoordinate());

    r1.moveLeft();
    System.out.println("After move left, Coordinates are: " + r1.getCoordinate());

    // Prueba de Triangle
    Triangle t1 = new Triangle(2, 3, 4.0, 5.0);
    System.out.println("Area of Triangle: " + t1.getArea());
    System.out.println("Coordinates of Triangle: " + t1.getCoordinate());

    t1.moveDown();
    System.out.println("After move Down, Coordinates are: " + t1.getCoordinate());

    t1.moveRight();
    System.out.println("After move right, Coordinates are: " + t1.getCoordinate());

    t1.moveUp();
    System.out.println("After move Up, Coordinates are: " + t1.getCoordinate());

    t1.moveLeft();
    System.out.println("After move left, Coordinates are: " + t1.getCoordinate());

  }

}
