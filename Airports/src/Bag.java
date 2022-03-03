package Airports.src;

public class Bag {
    private int weight;

    public Bag(int weight) throws Exception {
        if (weight <= 0) {
            throw new Exception("Bag must have a positive weight");
        }
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

}
