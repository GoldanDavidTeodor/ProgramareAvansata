package homework;

import java.util.ArrayList;
import java.util.List;

public class Runway {
    String runwayId;
    List<Flight> zboruri;

    public Runway(String runwayId) {
        this.runwayId = runwayId;
        this.zboruri = new ArrayList<>();
    }

    public boolean isFree(Flight flight) {
        for (Flight i: zboruri) {
            if(flight.landEnd.isAfter(i.landStart) && flight.landStart.isBefore(i.landEnd)) return false;
        }
        return true;
    }

    public void addFlight(Flight flight) {
        zboruri.add(flight);
    }

    @Override
    public String toString() {
        return "Runway ID: " + runwayId + " : " + zboruri; 
    }

}
