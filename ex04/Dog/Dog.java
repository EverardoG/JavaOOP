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

class DogPack{
  private Dog[] myDogs;

  void makeArray(int numDogs){
    // make an array of references
    this.myDogs = new Dog[numDogs];

    // Dog[] makes an array of Dog references
    // Dog specifies a type of variable reference
    // Dog() initializes a single Dog reference
    for (Dog dog:this.myDogs){
      dog = new Dog();
    }
  }

  void addDog(int index, Dog newDog){
    // assign newDog to myDogs at the given index
    this.myDogs[index] = newDog;
  }

  Dog biggestDog(){
    // finds biggest dog in array

    // start with first dog in array
    Dog biggest = myDogs[0];

    // iterate through myDogs
    for (Dog newDog:this.myDogs){
      // if the new dog is bigger than current dog
      if (newDog.isBigger(biggest)){
        // set the new dog as the biggest dog
        biggest = newDog;
        }
      }
    //return the reference to the biggest dog
    return biggest;
    }
  }
