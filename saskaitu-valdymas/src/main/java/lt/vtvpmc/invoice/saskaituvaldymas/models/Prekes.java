package lt.vtvpmc.invoice.saskaituvaldymas.models;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Prekes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pavadinimas;
    private String matavimoVienetas;
    private Integer kiekis;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SASKAITA_FAKTURA_ID")
    private SaskFaktura saskFaktura;

    public Prekes() {
        super();
    }

    public Prekes(String pavadinimas, Integer kiekis, String matavimoVienetas) {
        super();
        this.pavadinimas = pavadinimas;
        this.kiekis = kiekis;
        this.matavimoVienetas = matavimoVienetas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Integer getKiekis() {
        return kiekis;
    }

    public void setKiekis(Integer kiekis) {
        this.kiekis = kiekis;
    }

    public String getMatavimoVienetas() {
        return matavimoVienetas;
    }

    public void setMatavimoVienetas(String matavimoVienetas) {
        this.matavimoVienetas = matavimoVienetas;
    }

    public void setPrekes(SaskFaktura saskFaktura2) {
        this.saskFaktura = saskFaktura2;
    }

    public SaskFaktura getSaskFaktura() {
        return saskFaktura;
    }

    public void setSaskFaktura(SaskFaktura saskFaktura) {
        this.saskFaktura = saskFaktura;
    }

}
    