package compulsory;

public class Pair {
    private Location startingPoint;
    private Location endingPoint;
    private float time;
    private float probability;

    public Pair(Location startingPoint, Location endingPoint, float time, float probability) {
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.time = time;
        this.probability = probability;
    }

    public Location getStartingPoint() {
        return startingPoint;
    }

    public Location getEndingPoint() {
        return endingPoint;
    }

    public float getTime() {
        return time;
    }

    public float getProbability() {
        return probability;
    }

    @Override
    public String toString() {
        return "Starting from " + startingPoint + " got to: " + endingPoint + " in: " + time + "time and with probability: " + probability;
    }

}
