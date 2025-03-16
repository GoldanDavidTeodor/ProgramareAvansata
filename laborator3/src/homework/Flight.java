package homework;

import java.time.LocalTime;

public class Flight {
    String flightId;
    LocalTime landStart;
    LocalTime landEnd;

    public Flight(String flightId, LocalTime landStart, LocalTime landEnd) {
        this.flightId = flightId;
        this.landStart =landStart;
        this.landEnd = landEnd;
    }

    @Override
    public String toString() {
        return "Flight ID: " + flightId + " lands between:" + landStart + " and " + landEnd + "\n";
    }

 }