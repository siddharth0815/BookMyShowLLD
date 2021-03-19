package com.example.demo.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class TheatreOwner extends User{

    private int noOfTheatres;

    @OneToMany(mappedBy = "theatreOwner", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Theatre> theatres;




}
