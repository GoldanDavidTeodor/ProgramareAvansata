package homework;

import java.util.List;

public class Problema {
    public static void schedule(Airport airport, List<Flight> zboruri) {
        for (Flight i: zboruri) {
            Runway freeRunway = airport.freeRunway(i);
            if (freeRunway != null) {
                freeRunway.addFlight(i);
            }
            else {
                System.out.println("We couldn't fit in: " + i);
            }
        }
    }

}
