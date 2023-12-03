package task_1_4_8;

import java.util.List;

public class City {
    String name;
    List<String> trip_cost;

    public City(String name, List<String> trip_cost) {
        this.name = name;
        this.trip_cost = trip_cost;
    }
    public City (String name)
    {
        this.name=name;
        this.trip_cost=null;
    }

    @Override
    public String toString()
    {
        if(trip_cost==null)
            return name;
        return name+":"+trip_cost;
    }
}
