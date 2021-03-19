package com.example.demo.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Auditorium {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long audiId;
    @ManyToOne(fetch=FetchType.LAZY, optional = false)
    @JoinColumn(name = "theatre_id", nullable = false)
    private Theatre theatre;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "show_id", nullable = false)
    private Show show;
    @OneToMany(mappedBy="auditorium", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Seat> seats;
    private String audiName;
    int totalSeats;



}
