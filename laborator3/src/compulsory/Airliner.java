package compulsory;

public class Airliner extends Aircraft implements PassengerCapable {
    private int wingSpan;
    private int maxPassengers;
    public Airliner(String name, String model, String tailNumber, int wingSpan, int maxPassengers) {
        super(name, model, tailNumber);
        this.wingSpan = wingSpan;
        this.maxPassengers = maxPassengers;
    }

    public int getWingSpan() {
        return this.wingSpan;
    }

    @Override
    public int getMaxPassengers() {
        return this.maxPassengers;
    }

}
