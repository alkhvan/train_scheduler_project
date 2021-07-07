package my_project;

import my_project.model.TrainsSchedule;
import my_project.repo.TrainsRepoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainsService {
private TrainsRepoDB trainsRepoDB;
    @Autowired
    public TrainsService(TrainsRepoDB trainsRepoDB) {
        super();
        this.trainsRepoDB = trainsRepoDB;
    }
    public TrainsSchedule add (TrainsSchedule trainsSchedule){
        trainsRepoDB.save(trainsSchedule);
        System.out.println("Train was added to the main schedule");
        return trainsSchedule;
    }

    public TrainsSchedule update (TrainsSchedule trainsSchedule){
        trainsRepoDB.save(trainsSchedule);
        System.out.println("Train was updated in the main schedule");
        return trainsSchedule;
    }
}
