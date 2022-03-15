package patterns.solid.singleresponsibility.apply;


import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        Journal j = new Journal();
        j.addEntry("Today it was sunny");
        j.addEntry("Today it was cloudy");
        j.addEntry("Today it was very cold");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "C:\\Users\\Jenny\\Projects\\JavaDesignPatterns\\out\\journal.txt";
        p.saveToFile(j, filename, true);
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
