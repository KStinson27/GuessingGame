//create a jar class that accepts an itemName and a max number of items that can fit in the jar.
import java.util.Random;

class Jar {

  private String itemName;
  private int capacity;
  private int itemAmount;
  private int minCapacity = 1;
  
  
  public Jar(String itemName, int capacity){
  
    this.itemName = itemName;
    this.capacity = capacity;
  }
  
  public int fill(){
    Random r = new Random();
    itemAmount = r.nextInt(capacity - minCapacity + 1) + minCapacity;
    this.itemAmount = itemAmount;
    System.out.printf("The jar contains %d %s ", itemAmount , itemName); //used for testing
    return itemAmount;
  }  
 
  public boolean applyGuess(int guess){
  
    boolean isCorrect = itemAmount == guess;
    
    if(guess < itemAmount){
      System.out.println("Your guess is too low.");
    } else if (guess > itemAmount){
      System.out.println("Your guess is too high");
    }
    
    return isCorrect;    
  }
}
  
