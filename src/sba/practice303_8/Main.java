package sba.practice303_8;

public class Main {
  public static void main(String[] args) {
    int ticketTime = 10; // Example ticket time

    HospitalParking hospitalParking = new HospitalParking(ticketTime);
    MallParking mallParking = new MallParking(ticketTime);

    System.out.println(hospitalParking);
    System.out.println(mallParking);
  }
}
