package com.example.demo.model.entity;

import com.example.demo.model.internal.Genre;

import javax.persistence.*;

@Entity
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long showId;
    @ManyToOne(fetch=FetchType.LAZY, optional = false)
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;
    @ManyToOne(fetch=FetchType.LAZY, optional = false)
    @JoinColumn(name = "theatre_id", nullable = false)
    private Theatre theatre;
    @OneToOne(mappedBy = "show")
    private Auditorium auditorium;


}
