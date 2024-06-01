package com.example.bookmyshow.entity;

import com.example.bookmyshow.enums.MovieCategory;
import com.example.bookmyshow.enums.Genre;
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
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id ;

    @Column(nullable= false)
    private  String name ;

    private List<String> language ;

    private MovieCategory movieCategory;

    private Genre genre ;

    private Double rating ;

    private String description ;

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private Theatre theatre ;

    @OneToMany(mappedBy = "movies" , cascade = CascadeType.ALL)
    private List<Show>shows = new ArrayList<>() ;


}
