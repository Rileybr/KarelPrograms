import java.util.Scanner;

public class SeparatingDigits {
    private static int get_remainder(int a, int b) {
        return a % b;
    }

    private static int get_quotient(int a, int b){
        return a/b;
    }

    private static void part_c(int a, int b){
        // gets first digit and prints
        int one = get_quotient(a, (b * 100));
        System.out.print(one + "  ");

        // gets second digit and prints
        int working_two = get_quotient(a, (b *10));
        int two = get_remainder(working_two, b);
        System.out.print(two + "  ");

        // gets third digit and prints
        int three = get_quotient(a, b);
        int three_final = get_remainder(three, b);
        System.out.print(three_final + "  ");

        // gets fourth digit and prints
        int four = get_remainder(a, b);
        System.out.print(four);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an four digit integer: ");
        int a = scanner.nextInt();
        int b=10;
        part_c(a, b);
    }
}
