class Animal {
  void eat() {
    System.out.println("Eating");
  }
}

class Human extends Animal {
  void walk() {
    System.out.println("Walking");
  }
}

public class Two_a {
  public static void main(String[] args) {
    Human h = new Human();
    h.eat();
    h.walk();
  }
}
