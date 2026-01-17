package com.notzed.airbnbapp.repository;

import com.notzed.airbnbapp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
