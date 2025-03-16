package homework;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    List<Runway> runways;
    
    public Airport(int nrRunways) {
        this.runways = new ArrayList<>();
        for (int i=1; i<=nrRunways; i++) 
            runways.add(new Runway(""+i));
    }

    public Runway freeRunway(Flight flight) {
        for (Runway runway: runways) {
            if (runway.isFree(flight)) {
                return runway;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return runways.toString();
    }

}
