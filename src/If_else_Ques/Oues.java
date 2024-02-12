package If_else_Ques;

// Q.Accept three numbers and print the greatest among them

import java.util.Scanner;

public class Oues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1:");
        int a = sc.nextInt();
        System.out.println("Enter a number 2:");
        int b = sc.nextInt();
        System.out.println("Enter a number 3:");
        int c = sc.nextInt();
        int great = a;
        if (b > great)
          great = b;
        if (c > great)
            great = c;
        System.out.println("The Greatest number is: "+great);
    }
}

