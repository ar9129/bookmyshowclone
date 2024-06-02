package com.example.bookmyshow.service;

import com.example.bookmyshow.entity.City;
import com.example.bookmyshow.entity.Movie;
import com.example.bookmyshow.entity.Theatre;
import com.example.bookmyshow.repository.CityRepository;
import com.example.bookmyshow.repository.MovieRespository;
import com.example.bookmyshow.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MovieServiceImpl implements MovieService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private MovieRespository movieRespository;

    @Autowired
    private TheatreRepository theatreRepository;


    @Override
    public List<Movie> getMoviesbyCity(String cityName) {
        Optional<City>cityOptional = cityRepository.findByName(cityName) ;
        if(cityOptional.isPresent()){
            City city = cityOptional.get() ;
            List<Theatre> theatres = city.getTheatres() ;
            return  movieRespository.findByTheatreIn(theatres) ;
        }
        return  new ArrayList<>() ;

    }

}