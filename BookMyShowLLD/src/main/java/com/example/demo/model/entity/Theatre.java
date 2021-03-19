package com.example.demo.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long theatreId;
    @OneToMany(mappedBy="theatre", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Auditorium>auditoriums;
    String theatreName;
    String city;
    @OneToMany(mappedBy="theatre", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Show>shows;
    @ManyToOne(fetch=FetchType.LAZY, optional = false)
    @JoinColumn(name = "theatreOwner_id", nullable = false)
    TheatreOwner theatreOwner;


}
