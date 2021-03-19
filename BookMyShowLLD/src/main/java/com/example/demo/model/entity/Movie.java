package com.example.demo.model.entity;

import com.example.demo.model.internal.Genre;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movieId;
    private String movieName;
    private Genre genre;
    int durationInMins;
    String language;
    @OneToMany(mappedBy="movie", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Show> show;


}
