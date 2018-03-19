package lt.vtvpmc.invoice.saskaituvaldymas.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SaskFaktura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numeris;
    @Temporal(TemporalType.DATE)
    private Date israsymoData;
    private String israsantiImone;
    private String gavejas;

    @OneToMany(mappedBy = "saskFaktura")
    private List<Prekes> prekes;

    public void addPrekes(Prekes prekes)
    {
        this.prekes.add(prekes);
        prekes.setPrekes(this);
    }

    public SaskFaktura() {
        super();
    }

    public SaskFaktura(int numeris, Date israsymoData, String israsantiImone, String gavejas) {
        super();
        this.numeris = numeris;
        this.israsymoData = israsymoData;
        this.israsantiImone = israsantiImone;
        this.gavejas = gavejas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumeris() {
        return numeris;
    }

    public void setNumeris(int numeris) {
        this.numeris = numeris;
    }

    public Date getIsrasymoData() {
        return israsymoData;
    }

    public void setIsrasymoData(Date israsymoData) {
        this.israsymoData = israsymoData;
    }

    public String getIsrasantiImone() {
        return israsantiImone;
    }

    public void setIsrasantiImone(String israsantiImone) {
        this.israsantiImone = israsantiImone;
    }

    public String getGavejas() {
        return gavejas;
    }

    public void setGavejas(String gavejas) {
        this.gavejas = gavejas;
    }

}
    