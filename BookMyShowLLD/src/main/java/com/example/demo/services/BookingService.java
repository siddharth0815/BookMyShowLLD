package com.example.demo.services;

import com.example.demo.model.entity.Seat;

import java.util.List;

public class BookingService {
    public boolean bookSeat(Long seatId){
       return true;
    }
    public List<Seat>displayVacantSeats(Long showId){
        // auditoriumId is found by querying on showId as they have one to one mapping
        Long auditoriumId = null;
        // List of vacant seats in that auditorium are found having seatStatus = "AVAILABLE"
        List<Seat>vacantSeats = null;
        return vacantSeats;
    }
}
