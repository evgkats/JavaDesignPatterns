package patterns.solid.liskov.violate;

public class Demo {

    static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);
        //area = width * 10
        System.out.println("Expected area of " + width *10 + ", got " + rectangle.getArea());
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);

        Rectangle sq = new Square();
        sq.setWidth(3);
        useIt(sq);
    }
}
