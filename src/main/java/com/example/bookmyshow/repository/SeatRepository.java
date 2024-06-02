package com.example.bookmyshow.repository;

import com.example.bookmyshow.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
