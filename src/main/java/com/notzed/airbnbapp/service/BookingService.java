package com.notzed.airbnbapp.service;

import com.notzed.airbnbapp.dto.BookingDto;
import com.notzed.airbnbapp.dto.BookingRequest;
import com.notzed.airbnbapp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
