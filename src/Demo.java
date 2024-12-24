import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to be reversed here..");
        String name = sc.nextLine();
        String rev = "";
        int leng = name.length();
        for (int i=leng-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println("reverse is  " + rev);
    }
}
