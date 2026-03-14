package com.notzed.airbnbapp.repository;

import com.notzed.airbnbapp.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> findByPaymentSessionId(String sessionId);
}
