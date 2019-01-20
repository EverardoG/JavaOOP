public class MyFirstApp {

  /**
  * This really just simulates a gambling addiction. Not sure
  * why that's where my mind went, but it did. Anyway, that's
  * all I have to say about that.
  * @author Everardo Gonzalez
  */

  public static void main (String[] args){
    boolean isRich = true;
    if (isRich){
      System.out.println("I'm rich!");
    }

    int dollars = 3;
    boolean haveMoney = true;
    while (haveMoney){
      System.out.println("It's gambling time!");
      dollars = dollars - 1;
      System.out.print("Crap, now I only have ");
      System.out.print(dollars);
      System.out.println(" dollars!");

      if (dollars == 0){
        System.out.println("Dang, I'm out of money :(");
        haveMoney = false;
      }
    }
    System.out.println("Guess I'm done gambling then :)");
  }
}
