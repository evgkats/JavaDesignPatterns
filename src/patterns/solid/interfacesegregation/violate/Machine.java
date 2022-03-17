package patterns.solid.interfacesegregation.violate;

public interface Machine {
    void print(Document document);
    void fax(Document document);
    void scan(Document document);
}
