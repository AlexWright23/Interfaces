import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2, 2));  // Perimeter = 8
        rectangles.add(new Rectangle(3, 2));  // Perimeter = 10
        rectangles.add(new Rectangle(4, 2));  // Perimeter = 12
        rectangles.add(new Rectangle(1, 1));  // Perimeter = 4
        rectangles.add(new Rectangle(6, 1));  // Perimeter = 14
        rectangles.add(new Rectangle(5, 5));  // Perimeter = 20
        rectangles.add(new Rectangle(2, 3));  // Perimeter = 10
        rectangles.add(new Rectangle(7, 2));  // Perimeter = 18
        rectangles.add(new Rectangle(8, 1));  // Perimeter = 18
        rectangles.add(new Rectangle(1, 6));  // Perimeter = 14

        BigRectangleFilter filter = new BigRectangleFilter();

        System.out.println("Rectangles with a perimeter > 10:");
        for (Rectangle r : rectangles) {
            if (filter.accept(r)) {
                System.out.println(r);
            }
        }
    }
}
