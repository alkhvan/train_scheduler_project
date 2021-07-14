package my_project.view;

import my_project.TrainService;

import my_project.model.Trains;
import my_project.model.TrainsA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainRestController {
    private TrainService trainService;

@Autowired
    public TrainRestController(TrainService trainService) {
        super();
        this.trainService = trainService;
    }


    public TrainRestController() {
    }


    @GetMapping("/json/trains/all")
    public TrainsA getAll() {
        TrainsA trainsA = trainService.getAll();
        return trainsA;
    }



    @GetMapping("/json/trains/size")
    public Long getSize() {
        return trainService.size();
    }



    @GetMapping("/json/train/{id}")	// {id}
    public Trains getTrains(@PathVariable("id") Long id) {
        return trainService.get(id);
    }


    @PostMapping("/json/train")
    public Trains addTrains(@RequestBody Trains trains) {
        return trainService.add(trains);
    }


}
