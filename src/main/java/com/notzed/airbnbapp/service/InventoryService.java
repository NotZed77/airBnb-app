package com.notzed.airbnbapp.service;

import com.notzed.airbnbapp.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}
