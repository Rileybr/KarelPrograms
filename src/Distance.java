import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X Vale Of First Point: ");
        int x_one = scanner.nextInt();
        System.out.print("Enter Y Vale Of First Point: ");
        int y_one = scanner.nextInt();
        System.out.print("Enter X Vale Of Second Point: ");
        int x_two = scanner.nextInt();
        System.out.print("Enter y Vale Of Second Point: ");
        int y_two = scanner.nextInt();

        double distance = Math.sqrt((((Math.pow((x_two-x_one), 2))+(Math.pow((y_two-y_one), 2)))));
        System.out.print("The Distance Between (" + x_one + "," + y_one + ") and (" + x_two + "," + y_two + ") is ");
        System.out.print(distance);


    }
}