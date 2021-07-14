package my_project;

import my_project.model.Trains;
import my_project.model.TrainsA;
import my_project.repo.TrainRepoDB;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class TrainService {
    private TrainRepoDB trainRepoDB;
 @Autowired
    public TrainService(TrainRepoDB trainRepoDB) {
        this.trainRepoDB = trainRepoDB;
    }

    public Long size() {
        return trainRepoDB.count();
    }

    public TrainsA getAll() {
        TrainsA trainsA = new TrainsA();
        for (Trains t : trainRepoDB.findAll()) {
            trainsA.getTrains().add(t);
        }
        return trainsA;
    }

    public Trains get(Long id) {
        if (trainRepoDB.findById(id).isPresent()) {
            return trainRepoDB.findById(id).get();
        } else {
            return null;
        }
    }
    public Trains add (Trains trains){
        trainRepoDB.save(trains);
        System.out.println("Train was added to the schedule");
        return trains;
    }


}
