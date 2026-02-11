package com.notzed.airbnbapp.service;

import com.notzed.airbnbapp.dto.HotelDto;
import com.notzed.airbnbapp.dto.HotelInfoDto;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

     void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId);
}
