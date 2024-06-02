package com.example.bookmyshow.repository;


import com.example.bookmyshow.entity.Movie;
import com.example.bookmyshow.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRespository extends JpaRepository<Movie, Long> {

    List<Movie>findByTheatreIn(List<Theatre> theatre) ;




}
