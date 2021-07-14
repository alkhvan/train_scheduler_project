package my_project.model;

import java.util.ArrayList;
import java.util.List;

public class TrainsScheduleA {

    private List<TrainsSchedule> trainsSchedulesA = new ArrayList<TrainsSchedule>();

    public TrainsScheduleA() {
    }

    public TrainsScheduleA(List<TrainsSchedule> trainsSchedulesA) {
        this.trainsSchedulesA = trainsSchedulesA;
    }

    public List<TrainsSchedule> getTrainsSchedulesA() {
        return trainsSchedulesA;
    }

    public void setTrainsSchedulesA(List<TrainsSchedule> trainsSchedulesA) {
        this.trainsSchedulesA = trainsSchedulesA;
    }
}
