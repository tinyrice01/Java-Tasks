import java.util.Scanner;
public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        System.out.println(first+"+"+second+"="+(first+second));
        System.out.println(first+"-"+second+"="+(first-second));
        System.out.println(first+"*"+second+"="+(first*second));
        System.out.println(first+"/"+second+"="+(first/second));
    }
}
