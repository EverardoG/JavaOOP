class DogTestDrive{
  public static void main (String[] args){
    // Dog d = new Dog();
    // Dog two = new Dog();
    // d.setSize(1);
    // two.setSize(10);
    // System.out.println(d.isBigger(two));
    //
    // int x = d.getSize();
    // System.out.println("Size: "+x);

    // create an array of integer sizes
    int[] sizes = {1,2,3,4,54,2,32,43};

    //create a dog pack object
    DogPack doggos = new DogPack();

    // make room for the doggos
    doggos.makeArray(sizes.length);

    // populate each reference with a dog
    for (int i = 0; i < sizes.length; i++){
      System.out.println("Adding new dog");
      System.out.println("Size: "+sizes[i]);
      System.out.println("Index: "+i);
      Dog newDog = new Dog();
      newDog.setSize(sizes[i]);
      doggos.addDog(i ,newDog);
    }
  }
}
