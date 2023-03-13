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

class Professor extends Human {
  void study() {
    System.out.println("Teaching");
  }
}

public class Two_b {
  public static void main(String[] args) {
    Professor s = new Professor();
    s.eat();
    s.walk();
    s.study();
  }
}
