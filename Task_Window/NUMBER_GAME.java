package Task_Window;
import java.util.*;
public class NUMBER_GAME {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game: ");
        System.out.println("Let's Start,You have only 3 attempts to complete");
        int n=0;
        int attempts=0;
        int round=0;
        int roundWin=0;
        while (n == 0){
            round++;
            System.out.println("Round" + round);
            int randomNum = (int)(Math.random()*100);
            while(attempts < 3){
                System.out.println("Enter no. between 1-100: ");
                int guess = sc.nextInt();
                if (guess == randomNum){
                    System.out.println("WELL DONE");
                    roundWin++;
                    break;
                }  else if(guess < randomNum){
                    System.out.println("Number is too low");
                }
                else if (guess > randomNum){
                    System.out.println("Number is too high");
                } if (attempts == 3) {
                    System.out.println("Your all attempts are Exhausted");
                    System.out.println("The Number is: " + randomNum);
                }
                attempts++;
            }
            System.out.println("Total Attempts: "+attempts);
            System.out.println("Score: "+ (5 - attempts) + "/5");
            System.out.println("Enter 0 to continue the game \n Enter 1 to Exit the game");
            n = sc.nextInt();
            attempts = 0;
        }
        System.out.println("Total Rounds = " + round);
        System.out.println("Rounds Win = " + roundWin);
        System.out.println("THANK YOU VISIT AGAIN");
    }
}
