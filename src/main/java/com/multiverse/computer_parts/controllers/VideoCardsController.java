/*
 * Copyright (c) 2022.
 * This code was originally developed 03.07.2022, 20:25 by Valkov V.V.
 */

package com.multiverse.computer_parts.controllers;

import com.multiverse.computer_parts.dto.videoCards.VideoCardDto;
import com.multiverse.computer_parts.enums.ComputerParts;
import com.multiverse.computer_parts.service.SerializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videocards")
public class VideoCardsController {
    @Autowired
    SerializationService serializationService;

    @GetMapping("/list")
    public ResponseEntity<Object> getVideoCards() {
        VideoCardDto[] videoCardDtoList = null;
        ComputerParts computerPartsEnums = ComputerParts.VIDEO_CARDS;
        String jsonVideoCards = computerPartsEnums.json();
        videoCardDtoList = serializationService.serializeVideoCards(jsonVideoCards);
        return ResponseEntity.ok(videoCardDtoList);
    }

}
