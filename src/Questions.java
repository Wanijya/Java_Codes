
import java.util.Scanner;

// Question : Sum of Two Numbers 
// Write a program that takes two integers as input and prints their sum.

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number:");
        int firstNum = sc.nextInt();
        System.out.println("Enter a Second Number:");
        int secondNum = sc.nextInt();
        System.out.println("The sum of First and Second Numbers is: "+ (firstNum + secondNum));
    }
}
