package compulsory;

public class Drone extends Aircraft implements CargoCapable {
    private int baterryLife;
    private int maxCapacity;
    public Drone(String name, String model, String tailNumber, int baterryLife, int maxCapacity) {
        super(name, model, tailNumber);
        this.baterryLife = baterryLife;
        this.maxCapacity = maxCapacity;
    }

    public int getBaterryLife() {
        return this.baterryLife;
    }

    @Override
    public int getMaxCapacity() {
        return this.maxCapacity;
    }

}
