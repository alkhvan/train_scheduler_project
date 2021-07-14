package my_project.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="trains_sceduler")
public class TrainsSchedule {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO, generator = "native")
    private Long ID;
    @Version
    private Long version;
    @Column (name = "time")
    private String time;
    @Column (name = "type")
    private String type;
    @Column (name = "firm")
    private String firm;
    @Column (name = "information")
    private String information;
    @Column (name = "platform")
    private int platform;
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="trainsSchedule" ,cascade = CascadeType.ALL)
 //   @JoinColumn(name = "internalID")
     private List <Trains> trains;

    public TrainsSchedule() {
    }

    public TrainsSchedule(Long ID, Long version,String time, String type, String firm, String information, int platform) {
        this.ID = ID;
        this.version = version;
        this.type = type;
        this.firm = firm;
        this.information = information;
        this.platform = platform;
     //   this.internalID = internalID;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

  //  public int getInternalID() {
//        return internalID;
//    }
//
//    public void setInternalID(int internalID) {
//        this.internalID = internalID;
//    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}


