package patterns.solid.singleresponsibility.violate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/*
    This violates the single responsibility principle, because the Journal except the entries
    has now taken on a new concern.
    The Journal is not just handling the addition/removal of entries, but it is also handling
    persistence, which is a separate concern.
 */
public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    public void save(String filename) throws FileNotFoundException {
        try(PrintStream out = new PrintStream(filename)) {
            out.println(toString());
        }
    }

    public void load(String filename) {

    }

    public void load(URL url) {

    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
