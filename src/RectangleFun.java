import java.awt.*;
import java.util.Scanner;

public class RectangleFun {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter width: ");
        int width = scan.nextInt();

        System.out.print("Enter height: ");
        int height = scan.nextInt();

        System.out.print("Enter x coordinate: ");
        int x = scan.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = scan.nextInt();


        Rectangle rectangle = new Rectangle(x, y, width, height);

        System.out.println("Perimeter = " + ((rectangle.getHeight() * 2) + (rectangle.getWidth() * 2)));
        System.out.println("New Location is (" + (rectangle.getX() - 4) + ", " + (rectangle.getY() + 2) + ")");
    }
}
