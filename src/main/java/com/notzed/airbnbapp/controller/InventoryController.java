package com.notzed.airbnbapp.controller;

import com.notzed.airbnbapp.dto.InventoryDto;
import com.notzed.airbnbapp.dto.UpdateInventoryToRequestDto;
import com.notzed.airbnbapp.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/rooms/{roomId}")
    public ResponseEntity<List<InventoryDto>> getAllInventoryByRoom(@PathVariable Long roomId) {
        return ResponseEntity.ok(inventoryService.getAllInventoryByRoom(roomId));
    }

    @PatchMapping("/rooms/{roomId}")
    public ResponseEntity<Void> updateInventory(@PathVariable Long roomId,
                                                @RequestBody UpdateInventoryToRequestDto updateInventoryToRequestDto){
        inventoryService.updateInventory(roomId, updateInventoryToRequestDto);
        return ResponseEntity.noContent().build();
    }

}
