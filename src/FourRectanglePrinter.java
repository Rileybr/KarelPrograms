import java.awt.Rectangle;
import java.util.Scanner;

public class FourRectanglePrinter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width: ");
        int width = scanner.nextInt();
        System.out.print("Enter Height: ");
        int height = scanner.nextInt();
        Rectangle box = new Rectangle(0, 0, width, height);
        System.out.println(box);
        box.translate((int)box.getWidth(), (int)box.getHeight());
        System.out.println(box);
        box.translate(-(int)box.getWidth(), 0);
        System.out.println(box);
        box.translate((int)box.getWidth(), -(int)box.getHeight());
        System.out.println(box);

    }
}
