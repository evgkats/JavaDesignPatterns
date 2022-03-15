package patterns.solid.singleresponsibility.violate;

public class Demo {
    public static void main(String[] args) {
        Journal j = new Journal();
        j.addEntry("Today it was sunny");
        j.addEntry("Today it was cloudy");
        j.addEntry("Today it was very cold");

        System.out.println(j);
    }
}
