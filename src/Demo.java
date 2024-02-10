// Q. Accept the parameters and calculate the Compound Interest & print it on STDOUTQ.

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double n = sc.nextDouble();
        double amount = p * Math.pow(((100+r)/100), n);
        System.out.println(amount);
    }
}
