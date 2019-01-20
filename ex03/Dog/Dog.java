class Dog {
  private int size;
  String breed;
  String name;

  void setSize(int newSize){
    size = newSize;
  }

  int getSize(){
    return size;
  }

  void bark() {
    System.out.println("Ruff! Ruff!");
  }

  // returns true if current dog is bigger than input dog
  boolean isBigger(Dog inputDog){
    int mySize = this.getSize();
    int otherSize = inputDog.getSize();

    if (mySize>otherSize){
      return true;
    }
    else {
      return false;
    }

  }
}
