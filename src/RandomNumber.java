//Written by Riley Kalb
//This program generates a random number and then checks if higher/lower
//------------------------------------------------------------------------------
import java.util.Scanner;
public class RandomNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rndNumber, userGuess;
        
        rndNumber = generate();
        System.out.println("Enter your Guess. Type 0 to exit.");
        
        for (int i = 0;i < 10; i = 0) {
            userGuess = input.nextInt();
            if (userGuess == 0){
                System.out.println("Closing Program... . .");
                System.exit(0);    
            }
            sorter(rndNumber,userGuess);
        }
    }
    public static int generate() {
        int random = (int )(Math.random() * 100 + 1);
        return random;
    } 
    public static void sorter(int value, int guess){
        Scanner confirmation = new Scanner(System.in);
        int difference;
        if (value > guess) {
            difference = value - guess;
           
            if (difference > 30){
                System.out.println("Your Number is way too low");
          } else if (difference <= 30 && difference >=10) {
                System.out.println("Your Number is Low");
          } else if (difference <10 && difference > 0){
                System.out.println("Your Slightly Low");
          } 
        }
        if (guess > value) {
            difference = guess - value;
            
            if (difference > 30){
                System.out.println("Your Number is way too High");
          } else if (difference <= 30 && difference >=10) {
                System.out.println("Your Number is High");
          } else if (difference <10 && difference > 0){
                System.out.println("Your Slightly High");
          }
        }
        if (guess == value) {
            System.out.println("You guessed the right number!!!");
            System.exit(0);
        }
    }
}