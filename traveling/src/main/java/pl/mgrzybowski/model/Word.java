package pl.mgrzybowski.model;

import javax.persistence.*;
import java.util.List;

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

    @ManyToMany
    private List <WordList> word;


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
