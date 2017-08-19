import java.util.Scanner;

  
class Prompter{
  
  private final Scanner scanner;
  private Jar jar;
  private int mCapacity;
  private String mItemName;
 
  public Prompter(Scanner scan){
      scanner = scan;
  }
  
  //ADMIN SETUP
  public void adminWelcome(){
    System.out.println("Welcome GameMaster. Initiating Guessing Game Setup....");  
  }
  
  public String adminItemPrompt(){
    System.out.print("What type of item? ");
    mItemName = scanner.next();
    return mItemName;   
  }
  
  public int adminCapacityPrompt(){
    System.out.printf("What is the maximum amount of %s? ", mItemName);
    mCapacity = scanner.nextInt();  
    return mCapacity;
  }
  
  //PLAYER SETUP
  
  public String playerWelcome(){
    
    System.out.println("Welcome to the Guessing Game");
    System.out.printf("The goal of the game is to correctly guess the amount of %s in the jar. %n", mItemName);
    System.out.print("Are you ready to play? ");
    String playerReady = scanner.next();
    return playerReady; 
  }
  
  public boolean playerGuessPrompt(Jar jar){
    System.out.printf("Guess a number between 1 and %d.    ", mCapacity);
    int playerGuess = scanner.nextInt();
    
    while (playerGuess > mCapacity){
      
      System.out.printf("Your guess must be less than %d. Try again. %n", mCapacity);
      System.out.printf("Guess a number between 1 and %d.    ", mCapacity);
      playerGuess = scanner.nextInt();
    
    } 
      
     return jar.applyGuess(playerGuess);

  }
 
}