package com.notzed.airbnbapp.repository;

import com.notzed.airbnbapp.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
