package com.example.bookmyshow.service;


import com.example.bookmyshow.entity.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getMoviesbyCity(String cityName);
}
