package Mini_Project;

// Guess The Number:

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess = ((int)(Math.random() * 100) + 1);
        int noOfGuess = 10;
        do {
            System.out.print("Enter the Number: ");
            int in = sc.nextInt();
            if (in == guess){
                System.out.println("Your guess is Right!");
                break;
            }
            if (--noOfGuess == 0){
                System.out.println("Lost the Game!");
                break;
            }
            if (in > guess){
                System.out.println("Guess the Small Number!");
            }
            else
                System.out.println("Guess the Big Number!");
        } while (true);
    }
}
