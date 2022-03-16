package patterns.solid.openclosed.apply;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
