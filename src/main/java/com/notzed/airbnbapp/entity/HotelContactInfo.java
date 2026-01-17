package com.notzed.airbnbapp.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable // All the data is embedded in Hotel Class
public class HotelContactInfo {

    private String address;

    private String phoneNumber;

    private String email;

    private String location;
}
