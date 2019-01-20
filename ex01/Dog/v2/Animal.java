class Animal {
  int size;
  String breed;
  String name;

  void bark() {
    System.out.println("I am an animal.");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Bark! Bark!");
  }
}

class Cat extends Animal {
  void bark() {
    System.out.println("I am a cat");
  }
}
