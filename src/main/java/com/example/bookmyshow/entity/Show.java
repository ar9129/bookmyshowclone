package com.example.bookmyshow.entity;

import com.example.bookmyshow.enums.Format;
import com.example.bookmyshow.enums.Language;
import com.example.bookmyshow.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shows")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id ;

    private Date time ;

    private Language language ;

    private  Date date ;

    private Format format ;

    private Status status ;

    @ManyToOne
    @JoinColumn(name= "movie_id")
    private  Movie movie ;

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<Seat> seats = new ArrayList<>() ;


}
