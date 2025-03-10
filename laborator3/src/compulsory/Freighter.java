package compulsory;

public class Freighter extends Aircraft implements CargoCapable {
    private int wingSpan;
    private int maxCapacity;
    public Freighter(String name, String model, String tailNumber, int wingSpan, int maxCapacity) {
        super(name, model, tailNumber);
        this.wingSpan = wingSpan;
        this.maxCapacity = maxCapacity;
    }

    public int getWingSpan() {
        return this.wingSpan;
    }

    @Override
    public int getMaxCapacity() {
        return this.maxCapacity;
    }

}
