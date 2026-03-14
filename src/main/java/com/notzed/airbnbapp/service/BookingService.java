package com.notzed.airbnbapp.service;

import com.notzed.airbnbapp.dto.BookingDto;
import com.notzed.airbnbapp.dto.BookingRequest;
import com.notzed.airbnbapp.dto.GuestDto;
import com.stripe.model.Event;

import java.util.List;
import java.util.Map;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);

    String initiatePayment(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    String getBookingStauts(Long bookingId);

}
