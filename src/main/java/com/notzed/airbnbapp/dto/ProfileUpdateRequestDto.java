package com.notzed.airbnbapp.dto;

import com.notzed.airbnbapp.entity.Type.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ProfileUpdateRequestDto {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}
