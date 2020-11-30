package testgroup.filmography.model;


import lombok.Data;

import javax.persistence.*;
@Data

@Entity
@Table(name = "films")
public class  Film {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "genre")
    private String genre;

    @Column(name = "watched")
    private boolean watched;
    @Override
    public String toString() {
        return id + " " + title + " " + year + " " + genre + " " + watched;
    }
}

