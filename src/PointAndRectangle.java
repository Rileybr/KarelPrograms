import java.awt.*;
import java.util.Scanner;

public class PointAndRectangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the x coordinate: ");
        int x_value = scan.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y_value = scan.nextInt();
        System.out.print("Enter the length: ");
        int length = scan.nextInt();
        System.out.print("Enter the height: ");
        int height = scan.nextInt();

        Point point = new Point(x_value, y_value);

        Dimension dimension = new Dimension(length, height);

        Rectangle rectangle = new Rectangle(x_value, y_value, length, height);

        System.out.println(point);
        System.out.println(dimension);
        System.out.println(rectangle);
    }
}
