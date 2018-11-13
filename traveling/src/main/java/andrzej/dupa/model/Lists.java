package andrzej.dupa.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lists {

    @Id
    @GeneratedValue
    @Column(name="id_list")
    private long id;
    @Column(name="name_of_list")
    private String lists;


    public Lists(String lists) {
        this.lists = lists;
    }

    public Lists() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLists() {
        return lists;
    }

    public void setLists(String lists) {
        this.lists = lists;
    }
}
