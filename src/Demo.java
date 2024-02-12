// Q.Accept an integer and check whether it is an even number or odd.

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("This number is EVEN!!");
        } else if (num % 2 == 1) {
            System.out.println("This number is ODD!!");
        } else {
            System.out.println("Invalid Input!!!");
        }
    }
}
