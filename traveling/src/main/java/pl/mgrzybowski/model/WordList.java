package pl.mgrzybowski.model;


import javax.persistence.*;

@Entity
public class WordList {

    @Id
    @GeneratedValue
    @Column(name="id_list")
    private long id;
    @Column(name="name_of_list")
    private String listName;

    @ManyToOne
    private User owner;

    public void setOwner(User owner) {
        this.owner = owner;
    }
    public WordList(String lists) {
        this.listName = lists;
    }

    public WordList() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
}
