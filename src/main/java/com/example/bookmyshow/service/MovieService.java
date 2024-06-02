package com.example.bookmyshow.service;


import com.example.bookmyshow.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    List<Movie> getMoviesbyCity(String cityName, Optional<String> language, Optional<String>genre);
}
