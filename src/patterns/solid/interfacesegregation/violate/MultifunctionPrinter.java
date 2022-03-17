package patterns.solid.interfacesegregation.violate;

public class MultifunctionPrinter implements Machine {
    @Override
    public void print(Document document) {

    }

    @Override
    public void fax(Document document) {

    }

    @Override
    public void scan(Document document) {

    }
}
