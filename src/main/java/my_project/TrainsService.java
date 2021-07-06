package my_project;

import my_project.model.TrainDB;
import my_project.model.Trains;
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
    public Trains add (Trains trains){
        trainsRepoDB.save(trains);
        System.out.println("Train was added to the main schedule");
        return trains;
    }
}
