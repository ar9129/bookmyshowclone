package com.example.bookmyshow.repository;


import com.example.bookmyshow.entity.Movie;
import com.example.bookmyshow.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRespository extends JpaRepository<Movie, Long> {

    List<Movie>findByTheatreIn(List<Theatre> theatre) ;
    List<Movie>findByTheatre_City_NameANDLanguageANDGenre(String cityname, String language, String genre) ;
    List<Movie>findByTheatre_City_NameANDLanguage(String citynmae, String language) ;
    List<Movie>findByTheatre_City_NameANDGenre(String cityname, String genre) ;



}
