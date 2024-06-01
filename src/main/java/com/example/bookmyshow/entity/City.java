package com.example.bookmyshow.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id ;

    @Column(nullable= false)
    private String name ;

    private String state ;

    @OneToMany(mappedBy="cities", cascade = CascadeType.ALL)
    private List<Theatre> theatres = new ArrayList<>() ;


}
