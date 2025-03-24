package compulsory;

import com.github.javafaker.Faker;
import org.jgrapht.Graph;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Random random = new Random();

        List<Location> locations = new ArrayList<>();
        LocationType[] types = LocationType.values();

        for (int i = 0; i < 9; i++) {
            String randomName = faker.address().cityName();
            LocationType randomType = types[random.nextInt(types.length)];
            locations.add(new Location(randomName, randomType));
        }

        TreeSet<Location> friendlyLocations = locations.stream()
            .filter(i -> i.getLocationType() == LocationType.FRIENDLY)
            .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("Friendly locations: \n");
        friendlyLocations.forEach(System.out::println);

        List<Location> enemyLocations = locations.stream()
            .filter(i -> i.getLocationType() == LocationType.ENEMY)
            .sorted(Comparator.comparing(Location::getLocationType).thenComparing(Location::getName))
            .collect(Collectors.toCollection(LinkedList::new));

        System.out.println("\nEnemy locations:\n ");
        enemyLocations.forEach(System.out::println);

        Graph<Location, DefaultWeightedEdge> graph = new SimpleDirectedWeightedGraph<>(DefaultWeightedEdge.class);

        locations.forEach(graph::addVertex);

        List<Pair> paths = new ArrayList<>();
        for (int i = 0; i < locations.size(); i++) {
            for (int j = i + 1; j < locations.size(); j++) {
                float randomTime = 1 + random.nextFloat() * 9;  
                paths.add(new Pair(locations.get(i), locations.get(j), randomTime, random.nextFloat()));
            }
        }

        for (Pair pair : paths) {
            DefaultWeightedEdge edge = graph.addEdge(pair.getStartingPoint(), pair.getEndingPoint());
            graph.setEdgeWeight(edge, pair.getTime());
        }

        Location startLocation = locations.get(0);
        System.out.println("\nStarting location: " + startLocation);

        DijkstraShortestPath<Location, DefaultWeightedEdge> dijkstra = new DijkstraShortestPath<>(graph);
        Map<Location, Double> shortestPaths = new HashMap<>();
        
        for (Location loc : locations) {
            if (!loc.equals(startLocation)) {
                shortestPaths.put(loc, dijkstra.getPathWeight(startLocation, loc));
            }
        }

        Map<LocationType, List<Location>> groupedLocations = locations.stream()
            .collect(Collectors.groupingBy(Location::getLocationType));


        printLocationsByType(groupedLocations, shortestPaths, LocationType.FRIENDLY);
        printLocationsByType(groupedLocations, shortestPaths, LocationType.NEUTRAL);
        printLocationsByType(groupedLocations, shortestPaths, LocationType.ENEMY);
    }

    private static void printLocationsByType(Map<LocationType, List<Location>> groupedLocations,
                                             Map<Location, Double> shortestPaths,
                                             LocationType type) {
        System.out.println("\n" + type + " locations sorted by shortest path:\n");

        groupedLocations.getOrDefault(type, new ArrayList<>()).stream()
            .filter(shortestPaths::containsKey)
            .sorted(Comparator.comparing(shortestPaths::get))
            .forEach(loc -> System.out.println(loc + " - Time: " + shortestPaths.get(loc)));
    }
}
