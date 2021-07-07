package my_project.view;

import my_project.TrainService;
import my_project.TrainsService;
import my_project.model.Trains;
import my_project.model.TrainsSchedule;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainRestController {
    private TrainService trainService;
    private TrainsService trainsService;

    public TrainRestController(TrainService trainService) {
        this.trainService = trainService;
    }

    public TrainRestController(TrainsService trainsService) {
        this.trainsService = trainsService;
    }
    @PostMapping("/json/train")
    public Trains addTrains(@RequestBody Trains trains) {
        return trainService.add(trains);
    }

    @PostMapping("/json/trains")
    public TrainsSchedule addTrainsSchedule(@RequestBody TrainsSchedule trainsSchedule) {
        return trainsService.add(trainsSchedule);
    }
}
