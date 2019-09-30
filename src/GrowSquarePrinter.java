import java.awt.*;


public class GrowSquarePrinter {
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle(100, 100, 50, 50);
        System.out.println(rectangle);
        rectangle.grow((int)(rectangle.getWidth()/2), (int)(rectangle.getHeight()/2));
        rectangle.translate((int)(rectangle.getWidth()/4), (int)(rectangle.getHeight())/4);
        System.out.println(rectangle);
    }
}
