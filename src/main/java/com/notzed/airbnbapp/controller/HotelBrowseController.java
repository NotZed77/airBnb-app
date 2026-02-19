package com.notzed.airbnbapp.controller;

import com.notzed.airbnbapp.dto.HotelDto;
import com.notzed.airbnbapp.dto.HotelInfoDto;
import com.notzed.airbnbapp.dto.HotelPriceDto;
import com.notzed.airbnbapp.dto.HotelSearchRequest;
import com.notzed.airbnbapp.entity.Inventory;
import com.notzed.airbnbapp.service.HotelService;
import com.notzed.airbnbapp.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelBrowseController {

    private final InventoryService inventoryService;

    private final HotelService hotelService;

    @GetMapping("/search")
    public ResponseEntity<Page<HotelPriceDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest){

        var page = inventoryService.searchHotels(hotelSearchRequest);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId){
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId));
    }

}
