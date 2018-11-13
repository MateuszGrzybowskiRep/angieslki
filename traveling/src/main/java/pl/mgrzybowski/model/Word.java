package pl.mgrzybowski.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Word {

    @Id
    @GeneratedValue
    @Column(name="id_word")
    private long id;
    @Column(name = "eng_word")
    private String eng;
    @Column (name = "pol_word")
    private String pol;


    public Word(String eng, String pol) {
        this.eng = eng;
        this.pol = pol;
    }

    public Word() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }
}
