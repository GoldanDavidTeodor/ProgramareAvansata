package homework;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport(3);

        List<Flight> zboruri = new ArrayList<>();

        Flight f1 =new Flight("f1", LocalTime.of(11, 30), LocalTime.of(12, 0));
        Flight f2 =new Flight("f2", LocalTime.of(10, 0), LocalTime.of(10, 30));
        Flight f3 =new Flight("f3", LocalTime.of(19, 45), LocalTime.of(20, 0));
        Flight f4 =new Flight("f4", LocalTime.of(11, 30), LocalTime.of(12, 0));
        Flight f5 =new Flight("f5", LocalTime.of(4, 30), LocalTime.of(5, 0));

        zboruri.add(f1);
        zboruri.add(f2);
        zboruri.add(f3);
        zboruri.add(f4);
        zboruri.add(f5);

        Problema.schedule(airport, zboruri);

        System.out.println(airport);
    }
}
