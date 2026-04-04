package com.notzed.airbnbapp.controller;

import com.notzed.airbnbapp.dto.BookingDto;
import com.notzed.airbnbapp.dto.ProfileUpdateRequestDto;
import com.notzed.airbnbapp.dto.UserDto;
import com.notzed.airbnbapp.service.BookingService;
import com.notzed.airbnbapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final BookingService bookingService;

    @PatchMapping("/profile")
    public ResponseEntity<Void> updateProfile(@RequestBody ProfileUpdateRequestDto profileUpdateRequestDto){
        userService.updateProfile(profileUpdateRequestDto);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/myBookings")
    public ResponseEntity<List<BookingDto>> getMyBookings(){
        return ResponseEntity.ok(bookingService.getMyBookings());
    }

    @GetMapping("/profile")
    public ResponseEntity<UserDto> getMyProfile(){
        userService.getMyProfile();

        return ResponseEntity.noContent().build();
    }
}
