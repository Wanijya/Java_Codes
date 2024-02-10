import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();
        System.out.println("Enter a second num");
        int b = sc.nextInt();
        System.out.println("The sum is: "+ (a+b));
    }
}
