package com.notzed.airbnbapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelRecordDto {
    private Long bookingCount;
    private BigDecimal totalRevenue;
    private BigDecimal avgRenue;
}
