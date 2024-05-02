package PA_303.Polimorphism10_1;

public class StoneMonster extends Monster{

  public StoneMonster(String name) {
    this.name = name;
  }

  @Override
  public String attack() {
    return ("Attack with stones!");
  }
}
