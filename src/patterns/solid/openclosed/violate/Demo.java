package patterns.solid.openclosed.violate;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green products: ");
        productFilter
                .filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(p.name));

        System.out.println("Large products: ");
        productFilter
                .filterBySize(products, Size.LARGE)
                .forEach(p -> System.out.println(p.name));

        System.out.println("Large and green products: ");
        productFilter
                .filterByColorAndSize(products, Color.GREEN, Size.LARGE)
                .forEach(p -> System.out.println(p.name));
    }
}
