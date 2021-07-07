package my_project.repo;

import my_project.model.Trains;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepoDB extends JpaRepository<Trains,Long> {

}
