import java.awt.*;

public class CenterSquarePrinter {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(100, 100, 200, 200);
        System.out.println(rectangle);
        rectangle.grow(-(int)(rectangle.getWidth()/4), -(int)(rectangle.getHeight()/4));
        rectangle.translate((int)(rectangle.getWidth()/2), (int)(rectangle.getHeight())/2);
        System.out.println(rectangle);
    }
}
