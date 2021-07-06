package my_project;

import my_project.model.Trains;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TrainsRepoDB extends CrudRepository<Trains,Long> {
  @Query (value = "Select * from trains_sceduler trMain " +
          "FULL JOIN trains_sceduler_DB trDB on trMain.internalIDMain = trDB.internalID " +
          "FULL JOIN trains_sceduler_ODEG trODEG on trMain.internalIDMain = trODEG.internalID ",nativeQuery=true)
    Iterable<Trains> selectTrains();
}
