package my_project.model;

import javax.persistence.*;

@Entity
@Table(name="trains_sceduler_ODEG")
public class Trains {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    @Version
    private Long version;
    @Column (name = "time")
    private String time;
    @Column (name = "direction")
    private String direction;
    @Column (name = "delay")
    private String delay;

    @ManyToOne(cascade  = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinColumn(name = "internalID")
    private TrainsSchedule trainsSchedule;

    public Trains() {
    }

    public Trains(Long ID, Long version, String time, String direction, String delay) {
        this.ID = ID;
        this.version = version;
        this.time = time;
        this.direction = direction;
        this.delay = delay;

    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }


    @Override
    public String toString() {
        return "\nTrains{" +
                "ID=" + ID +
                ", version=" + version +
                ", time='" + time + '\'' +
                ", direction='" + direction + '\'' +
                ", delay='" + delay + '\'' +
                ", trainsSchedule=" + trainsSchedule +
                '}';
    }
}
