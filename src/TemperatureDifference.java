import java.util.Scanner;

public class TemperatureDifference {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first temperature: ");
        int temp_one = scanner.nextInt();
        System.out.print("Enter second temperature: ");
        int temp_two = scanner.nextInt();

        System.out.print("The temperature changed " + (Math.abs(Math.subtractExact(temp_one, temp_two))) + " degrees");

    }
}
