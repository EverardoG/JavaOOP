class DogTestDrive{
  public static void main (String[] args){
    Dog d = new Dog();
    Dog two = new Dog();
    d.setSize(1);
    two.setSize(10);
    System.out.println(d.isBigger(two));

    int x = d.getSize();
    System.out.println("Size: "+x);
  }
}
