package compulsory;

public class Location implements Comparable<Location> {  
    private String name;
    private LocationType type;

    public Location(String name, LocationType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocationType getLocationType() {
        return type;
    }

    @Override
    public String toString() {
        return "location: " + name + " of type: " + type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Location location = (Location) obj;
        return name.equals(location.name) && type == location.type;
    }

    @Override
    public int compareTo(Location other) { 
        return this.name.compareTo(other.name);
    }

}
