package patterns.solid.openclosed.apply;

import java.util.List;

public class MultipleSpecifications<T> implements Specification<T> {

    private List<Specification<T>> specifications;

    public MultipleSpecifications(List<Specification<T>> specifications) {
        this.specifications = specifications;
    }

    @Override
    public boolean isSatisfied(T item) {
        return specifications.stream()
                .allMatch(specification -> specification.isSatisfied(item));
    }
}
