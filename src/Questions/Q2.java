package Questions;

// Chack No. is prime or not

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num ; i++) {
            if (num%i == 0){
                count++;
            }
        }
        System.out.println(count == 2 ? "Prime!" : "Not a Prime!");
    }
}
