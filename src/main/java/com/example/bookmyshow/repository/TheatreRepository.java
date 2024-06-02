package com.example.bookmyshow.repository;

import com.example.bookmyshow.entity.City;
import com.example.bookmyshow.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreRepository extends JpaRepository<Theatre,Long> {

    List<Theatre> findByCity(City city) ;
}
