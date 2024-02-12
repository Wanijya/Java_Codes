// Q.Accept two numbers and print the greatest between them

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st num: ");
        int a = sc.nextInt();
        System.out.println("Enter a 2nd num: ");
        int b = sc.nextInt();
        if (a > b){
            System.out.println(a + " is greater.");
        } else if (a < b) {
            System.out.println(b + " is greater.");
        } else {
            System.out.println("Both are equal.");
        }
    }
}
