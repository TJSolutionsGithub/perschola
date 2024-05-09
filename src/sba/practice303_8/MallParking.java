package sba.practice303_8;

class MallParking implements ParkingSystem {

  private int time;
  private double surcharge = 0.10; // 10% surcharge

  public MallParking(int time) {
    this.time = time;
  }

  @Override
  public double processTicket() {
    double price = 0;
    if (time >= 5 && time < 17) { // 5am - 5pm
      price = MORNING;
    } else if (time >= 17 && time < 24) { // 5pm - 12am
      price = NIGHTLY;
    } else { // 12am - 5am
      price = TWENTY_FOUR;
    }
    return price * (1 + surcharge);
  }

  @Override
  public String toString() {
    return String.format("Price for mall parking is $%.2f", processTicket());
  }
}
