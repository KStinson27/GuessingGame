import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
     
      Scanner scanner = new Scanner(System.in);
      Prompter prompter = new Prompter(scanner);
      int numberOfGuesses = 0;
      int playerGuess;
      boolean isAnswer;
      
      prompter.adminWelcome();
      
      Jar jar = new Jar(prompter.adminItemPrompt(), prompter.adminCapacityPrompt());
      jar.fill();
      
      System.out.print("\033[H\033[2J");
      
      String playerReady = prompter.playerWelcome();
      

      if(playerReady.equalsIgnoreCase("yes")){
       
        System.out.println("Awesome! Let's get started!");
      
      } else {
        System.exit(0);
      }
        
      boolean again = true;
      
      do{
        isAnswer = prompter.playerGuessPrompt(jar);
   
        if(isAnswer){
          again = false;
          numberOfGuesses++;
          System.out.printf("That is correct! You got it in %d attempts.", numberOfGuesses);
          System.exit(0);   
        } else{
          System.out.println("Try again");
          numberOfGuesses++;
        }
          
      } while (again == true);
          
   }

}
