package com.example.bookmyshow.controller;

import com.example.bookmyshow.entity.Movie;
import com.example.bookmyshow.repository.CityRepository;
import com.example.bookmyshow.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public class MovieController {

    private MovieService movieService ;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping({"/city/{cityname}"})
    public ResponseEntity<List<Movie>> getMoviesbyCity(@RequestParam String cityname, @RequestParam Optional<String>language,@RequestParam Optional<String>genre){
        return  ResponseEntity.ok().body(movieService.getMoviesbyCity(cityname,language,genre)) ;
    }



}

