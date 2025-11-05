import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Enter The Number between 1 to 100: ");
        int userGuess=sc.nextInt();

        int numberToGuess = rand.nextInt(100) + 1;
        int chance=3;
        while (chance>1 && userGuess!=numberToGuess) {
            chance--;
            System.out.println("Wrong Guess, Try Again! You have "+chance+" chances left.");

            if (userGuess < numberToGuess) {
            System.out.println("Your guess is too low.");
           } else if (userGuess > numberToGuess) {
            System.out.println("Your guess is too high.");
           }
            System.out.println("Enter The Number between 1 to 100: ");
            userGuess=sc.nextInt();
            
        }
        
        if(userGuess!=numberToGuess){
            System.out.println("Sorry, you've used all your chances. The correct number was " + numberToGuess + ".");
        }   
        else{
            System.out.println("Congratulations! You've guessed the number.");
        }
    }
}
