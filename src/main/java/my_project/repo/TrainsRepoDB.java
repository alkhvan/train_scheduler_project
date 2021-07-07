package my_project.repo;


import my_project.model.TrainsSchedule;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TrainsRepoDB extends CrudRepository<TrainsSchedule,Long> {
//  @Query (value = "Select * from trains_sceduler trMain " +
//         "FULL JOIN trains_sceduler_ODEG trODEG on trMain.internalIDMain = trODEG.internalID ",nativeQuery=true)
//    Iterable<TrainsSchedule> selectTrains();
}
