package com.example.demo.model.entity;

import com.example.demo.model.internal.SeatStatus;

import javax.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seatId;
    SeatStatus seatStatus;
    private Double price;
    @ManyToOne(fetch=FetchType.LAZY, optional = false)
    @JoinColumn(name = "auditorium_id", nullable = false)
    Auditorium auditorium;
}
