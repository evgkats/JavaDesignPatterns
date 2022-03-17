package patterns.solid.liskov.apply;

/*
    Enforce Liskov Substitution Principle by using the Factory design pattern
 */
public class RectangleFactory {
    public static Rectangle newRectangle(int width, int height) {
        return new Rectangle(width, height);
    }

    public static Rectangle newSquare(int side) {
        return new Rectangle(side, side);
    }
}
