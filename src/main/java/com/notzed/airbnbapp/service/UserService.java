package com.notzed.airbnbapp.service;

import com.notzed.airbnbapp.dto.ProfileUpdateRequestDto;
import com.notzed.airbnbapp.dto.UserDto;
import com.notzed.airbnbapp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
