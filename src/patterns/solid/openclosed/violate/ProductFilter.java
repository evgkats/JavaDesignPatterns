package patterns.solid.openclosed.violate;

import java.util.List;
import java.util.stream.Stream;


/*
    This breaks the open-closed principle, because every time we need a new filter
    we have to come to this class and add more code and methods
 */
public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream()
                .filter(p -> p.color == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream()
                .filter(p -> p.size == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
        return products.stream()
                .filter(p -> p.size == size && p.color == color);
    }
}
