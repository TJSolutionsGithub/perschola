package PA_303.Polimorphism10_1;

public class WaterMonster extends Monster{

  public WaterMonster(String name) {
    this.name = name;
  }

  @Override
  public String attack() {
    return ("Attack with water!");
  }
}
