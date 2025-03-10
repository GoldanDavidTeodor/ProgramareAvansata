package compulsory;

public class Flight {
    private String idFlight;
    private Aircraft aircraft;
    private int timeStart;
    private int timeEnd;

    public Flight(String idFlight, Aircraft aircraft, int timeStart, int timeEnd) {
        this.idFlight = idFlight;
        this.aircraft = aircraft;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String getIdFlight() {
        return idFlight;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public int getTimeStart() {
        return timeStart;
    }

    public int getTimeEnd() {
        return timeEnd;
    }

    public boolean conflictsWith(Flight flight) {
        if (this.timeStart>flight.timeEnd || this.timeEnd<flight.timeStart) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Flight ID: " + idFlight + " by " + aircraft.getName() + " arrives at: " + timeStart + " and is put away at: " + timeEnd + "\n";
    }


}
