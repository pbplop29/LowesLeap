interface Drive {
  void drive();
}

interface Fly {
  void fly();
}

class Car implements Drive, Fly {
  public void drive() {
    System.out.println("Driving");
  }
  public void fly() {
    System.out.println("Flying");
  }
}

public class Two_c {
  public static void main(String[] args) {
    Car c = new Car();
    c.drive();
    c.fly();
  }
}
