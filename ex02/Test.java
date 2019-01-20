public class Test{
  public static void main(String[] args){
    // This only creates an array of dog refernces that currently point to nothing
    Dog[] myDogs = new Dog[3]; // 3 dog references

    // for each reference, make an actual Dog object
    int z = 0;
    while ( z < myDogs.length) {//length of the reference array
      myDogs[z] = new Dog(); // create an actual object for that reference

      if (z == 0){
        myDogs[z].name = "Tobi";
        myDogs[z].breed = "rottweiler";
        myDogs[z].size = 10;
      }

      if (z == 1){
        myDogs[z].name = "Explory";
        myDogs[z].breed = "chichuachua";
        myDogs[z].size = 1;
      }

      if (z == 2){
        myDogs[z].name = "Cookie";
        myDogs[z].breed = "miniature pincher";
        myDogs[z].size = 3;
      }
      z = z + 1;
    }

    // for each reference, make the dog bark
    z = 0;
    while (z < myDogs.length) {
      myDogs[z].bark();
      z=z+1;
    }

    // for each reference, check if this dog is the biggest
    z = 0;
    Dog biggest = null; // this is a reference to the biggest dog
    // it is null to begin with, but it allocated in memory as a dog reference
    while (z<myDogs.length){
      if (biggest==null){
        biggest = myDogs[z];
      }
      else{
        if (myDogs[z].size > biggest.size){
          biggest = myDogs[z];
        }
      }
      z=z+1;
    }
    System.out.println("Biggest dog is: "+biggest.name);
  }
}
