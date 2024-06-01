package com.example.bookmyshow.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "theatres")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id ;

    private String name ;

    private List<Integer> seatNumber ;

    @ManyToOne
    @JoinColumn(name= "City_Id")
    private  City city ;


    @OneToMany(mappedBy = "theatres", cascade = CascadeType.ALL)
    private List<Movie> movies = new ArrayList<>() ;


}
