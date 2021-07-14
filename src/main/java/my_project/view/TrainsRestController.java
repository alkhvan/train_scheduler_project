package my_project.view;

import my_project.TrainsService;
import my_project.model.TrainsSchedule;
import my_project.model.TrainsScheduleA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TrainsRestController {
    private TrainsService trainsService;


    public TrainsRestController() {
    }
@Autowired
    public TrainsRestController(TrainsService trainsService) {
        this.trainsService = trainsService;
    }

    @GetMapping("/json/trainSchs/all")
    public TrainsScheduleA getAllSchedule() {
        TrainsScheduleA trainsScheduleA = trainsService.getAll();
        return trainsScheduleA;
    }
    @GetMapping("/json/trainSchs/size")
    public Long getSizeMain() {
        return trainsService.size();
    }
    @GetMapping("/json/trainSch/{id}")	// {id}
    public TrainsSchedule getTrainsSchedule(@PathVariable("id") Long id) {
        return trainsService.get(id);
    }

    @PostMapping("/json/trainSch")
    public TrainsSchedule addTrainsSchedule(@RequestBody TrainsSchedule trainsSchedule) {
        return trainsService.add(trainsSchedule);
    }

}
