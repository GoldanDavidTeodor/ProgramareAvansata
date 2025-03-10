package compulsory;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    public static void main(String[] args) throws Exception {
        Aircraft a1 = new Airliner("AvionWoW02", "39887-487", "N714cX", 50, 120);
        Aircraft a2 = new Freighter("Airbus3000", "B2-5649", "NICE56", 60, 3);
        Aircraft a3 = new Drone("DronaGOpro89", "ModelDrona68", "drone257", 10, 1);

        Flight f1 = new Flight("kjaskjfk", a1, 1, 2);
        Flight f2 = new Flight("silfjkas", a2, 10, 11);
        Flight f3 = new Flight("ogafsjfasf", a3, 16, 17);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println("+--------------------+\n");

        List<Aircraft> cargoList = new ArrayList<>();
        cargoList.add(a2);
        cargoList.add(a3);
        System.out.println("Cargo capable aircrafts:\n");
        System.out.println(cargoList);
        System.out.println("+--------------------+\n");




    }
}
