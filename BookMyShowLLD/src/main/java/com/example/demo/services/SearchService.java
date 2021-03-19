package com.example.demo.services;

import com.example.demo.model.entity.Movie;
import com.example.demo.model.entity.Show;
import com.example.demo.model.entity.Theatre;

import java.util.List;

public class SearchService {
    public List<Theatre> findAllThreatres(){
        //List of Threatres
        List<Theatre>response = null;
        return response;
    }
    public List<Movie> findAllMovies(String cityName){
        //List of Movies
        List<Movie>response = null;
        return response;
    }
    public List<Show> findAllShows(String movieName, String threatreName){
        //List of Shows of a particular movie
        List<Show>response = null;
        return response;
    }


}
