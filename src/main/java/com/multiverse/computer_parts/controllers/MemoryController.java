/*
 * Copyright (c) 2022.
 * This code was originally developed 03.07.2022, 20:26 by Valkov V.V.
 */

package com.multiverse.computer_parts.controllers;

import com.multiverse.computer_parts.dto.memory.MemoryDto;
import com.multiverse.computer_parts.enums.ComputerParts;
import com.multiverse.computer_parts.service.SerializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/memory")
public class MemoryController {
    @Autowired
    SerializationService serializationService;

    @GetMapping("/list")
    public ResponseEntity<Object> getMemories(){
        MemoryDto[] memoryDtoList = null;
        ComputerParts computerPartsEnums = ComputerParts.MEMORY;
        String jsonMemory = computerPartsEnums.json();
        memoryDtoList = serializationService.serializeMemory(jsonMemory);
        return ResponseEntity.ok(memoryDtoList);
    }
}
