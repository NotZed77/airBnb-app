package com.notzed.airbnbapp.dto;

import com.notzed.airbnbapp.entity.Hotel;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class RoomDto {

    private Long id;

    private String type;

    private BigDecimal basePrice;

    private List<String> photos;

    private List<String> amenities;

    private Integer totalCount;

    private Integer capacity;
}
