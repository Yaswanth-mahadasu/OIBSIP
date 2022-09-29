// Number guessing game :
import java.util.Scanner;

public class NumberGuess{
    public static void main(String[] args) {
        //The chances would be put zero or else one
        int Chances=1;
        //We have to use the mathematical random method to execute perfectly
        int NumberGuess=(int)(Math.random()*99+1);
        int RealNumber=63;
        int Score;
        //Read the input From the user
        Scanner sc=new Scanner(System.in);
        System.out.println("\tWelcome to the Game of Number guessing");
        System.out.println("\tYou have maximum limit Up to 5 Attempts ");
        System.out.println("\tPlay well with Confidence, All the best");

        for (int i=1;i<100;i++){
            System.out.println("\nEnter a number between 1 to 100 :");
            int userInput=sc.nextInt();


            if (RealNumber == userInput){
                System.out.println("OOho yes you got the correct number, You won the game");

            } else if (userInput<NumberGuess ) {
                System.out.println("\nYour guess number is Smallest");

            } else if (userInput>NumberGuess){
                System.out.println("\nYour guess is high");
            }
            if (Chances == 5){
                System.out.println("\nYou have played the maximum number of chances\tTry again");
                break;
            } else if (userInput>100) {
                System.out.println("\nEnter a valid integer");
            }
            Chances++;
        }


        }

    }
