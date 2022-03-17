package patterns.solid.liskov.apply;

import patterns.solid.liskov.apply.Rectangle;

public class Demo {

    static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);
        //area = width * 10
        System.out.println("Expected area of " + width *10 + ", got " + rectangle.getArea());
    }

    public static void main(String[] args) {
        Rectangle rc = RectangleFactory.newRectangle(2, 3);
        useIt(rc);

        Rectangle sq = RectangleFactory.newSquare(2);
        sq.setWidth(3);
        useIt(sq);
    }
}
