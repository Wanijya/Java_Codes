
import java.util.Scanner;

// Question : Swap Two Numbers
// Write a Java program to swap two numbers without using a third variable.

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number:");
        int firstNum = sc.nextInt();
        System.out.println("Enter a Second Number:");
        int secondNum = sc.nextInt();
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
        System.out.println("After Swapping");
        System.out.println("First Number is: " + firstNum);
        System.out.println("Second Number is: " + secondNum);
    }
}
