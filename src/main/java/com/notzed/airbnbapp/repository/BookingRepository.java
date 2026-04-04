package com.notzed.airbnbapp.repository;

import com.notzed.airbnbapp.dto.BookingDto;
import com.notzed.airbnbapp.entity.Booking;
import com.notzed.airbnbapp.entity.Hotel;
import com.notzed.airbnbapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> findByPaymentSessionId(String sessionId);

    List<Booking> findByHotel(Hotel hotel);

    List<Booking> findByHotelAndCreatedAtBetween(Hotel hotel, LocalDateTime startDateTime, LocalDateTime endDateTime);

    List<BookingDto> findByUser(User user);
}
