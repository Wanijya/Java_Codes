package Questions;

// Q. Find the Largest Element in the Array.

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrya: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int larget = arr[0];
        System.out.println("Enter the elements of the arrya:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<size; i++){
            if (arr[i] > larget){
                larget = arr[i];
            }
        }
        System.out.println("The larget value is: "+ larget);
    }
}
