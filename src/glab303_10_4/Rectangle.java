package glab303_10_4;

public class Rectangle extends Shape implements  Movable{
  private int x, y; // x and y coordinates of the top-left corner

  public Rectangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public Rectangle(int x, int y, double width, double height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public void displayshapName() {
    System.out.println("Drawing a Rectangle with width " + width + " and height " + height);
  }

  @Override
  public String toString() {
    return "Rectangle[ width = " + width + ", height = " + height + super.toString() + "] ";
  }

  public String getCoordinate() {
    return "(" + x + "," + y + ")";
  }

  @Override
  public void moveUp() {
    y++;
  }

  @Override
  public void moveDown() {
    y--;
  }

  @Override
  public void moveLeft() {
    x--;
  }

  @Override
  public void moveRight() {
    x++;
  }
}
