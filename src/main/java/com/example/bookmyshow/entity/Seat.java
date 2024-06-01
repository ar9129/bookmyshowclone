package com.example.bookmyshow.entity;

import com.example.bookmyshow.enums.SeatCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "seats")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id ;

    private SeatCategory seatCategory ;



    @Column(nullable= false)
    private  String  seatNumber ;

    private  Integer price ;

    private Boolean isBooked ;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private  Show show ;
}
