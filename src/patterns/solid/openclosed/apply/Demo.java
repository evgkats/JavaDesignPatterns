package patterns.solid.openclosed.apply;


import java.util.Arrays;
import java.util.List;


/*
    Applying Specification Design Pattern to enforce Open-Closed principle
 */
public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        List<Product> products = List.of(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();

        // filter by color
        System.out.println("Green products: ");
        ColorSpecification colorSpecification = new ColorSpecification(Color.GREEN);
        productFilter.filter(products, colorSpecification)
                .forEach(p-> System.out.println(p.name));

        // filter by size
        System.out.println("Large products: ");
        SizeSpecification sizeSpecification = new SizeSpecification(Size.LARGE);
        productFilter.filter(products, sizeSpecification)
                .forEach(p-> System.out.println(p.name));

        // filter by both color and size
        System.out.println("Large and Green products: ");
        productFilter.filter(products, new MultipleSpecifications<>(Arrays.asList(colorSpecification, sizeSpecification)))
                .forEach(p-> System.out.println(p.name));

    }
}
