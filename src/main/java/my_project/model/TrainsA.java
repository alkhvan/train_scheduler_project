package my_project.model;

import java.util.ArrayList;
import java.util.List;

public class TrainsA {

    private List<Trains> trains = new ArrayList<Trains>();

    public TrainsA(List<Trains> trains) {
        this.trains = trains;
    }

    public TrainsA() {
    }

    public List<Trains> getTrains() {
        return trains;
    }

    public void setTrains(List<Trains> trains) {
        this.trains = trains;
    }
}
