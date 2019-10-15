import java.util.Scanner;

public class FindThePower {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Base: ");
        int base = scanner.nextInt();
        System.out.print("Enter The Exponent: ");
        int exponent = scanner.nextInt();

        System.out.print(base + "^" + exponent + " = " +Math.pow(base, exponent));
    }
}
