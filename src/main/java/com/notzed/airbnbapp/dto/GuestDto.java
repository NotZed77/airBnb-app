package com.notzed.airbnbapp.dto;

import com.notzed.airbnbapp.entity.Type.Gender;
import com.notzed.airbnbapp.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class GuestDto {

    private Long id;

    private User user;

    private String name;

    private Gender gender;

    private Integer age;

}
