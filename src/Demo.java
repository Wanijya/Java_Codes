import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle");
        double principle = sc.nextDouble();
        System.out.println("Enter rate");
        double rate = sc.nextDouble();
        System.out.println("Enter time in years");
        double time = sc.nextDouble();
        double interest = principle * Math.pow(((100+rate)/100),time);
        System.out.println("Interest is " + interest);
    }
}
