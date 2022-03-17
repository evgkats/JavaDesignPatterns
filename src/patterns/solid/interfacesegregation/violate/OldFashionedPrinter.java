package patterns.solid.interfacesegregation.violate;

/*
    When we leave empty methods, we still give the user an indication that we must support
    the empty methods too, so it is confusing that upon calling them nothing happens
 */
public class OldFashionedPrinter implements Machine {
    @Override
    public void print(Document document) {
        // can be implemented
    }

    @Override
    public void fax(Document document) {
        // Option1: leave empty, old printer does not support this method!
        // Option2: throw an Exception
    }

    @Override
    public void scan(Document document) {
        // leave empty, old printer does not support this method!
    }
}
