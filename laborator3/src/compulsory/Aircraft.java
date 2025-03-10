package compulsory;

public class Aircraft {
    private String model;
    private String tailNumber;
    private String name;

    public Aircraft(String name, String model, String tailNumber) {
        this.name = name;
        this.tailNumber = tailNumber;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public String getTailNumber() {
        return this.tailNumber;
    }
    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return "Aircraft name: " + name + " model: " + model + " tail number: " + tailNumber + ",\n";
    }
}
