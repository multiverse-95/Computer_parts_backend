/*
 * Copyright (c) 2022.
 * This code was originally developed 03.07.2022, 20:25 by Valkov V.V.
 */

package com.multiverse.computer_parts.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.multiverse.computer_parts.dto.videoCards.VideoCardDto;
import com.multiverse.computer_parts.enums.ComputerParts;
import com.multiverse.computer_parts.service.SerializationService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @GetMapping("/product/{guid}")
    public ResponseEntity<Object> getVideoCardById(@PathVariable String guid) throws JsonProcessingException {
        VideoCardDto videoCardDto = new VideoCardDto();
        ComputerParts computerPartsEnums = ComputerParts.VIDEO_CARDS;
        String jsonVideoCards = computerPartsEnums.json();
        ObjectMapper objectMapper = new ObjectMapper();
        List<VideoCardDto> myObjects = objectMapper.readValue(jsonVideoCards, new TypeReference<List<VideoCardDto>>(){});
        for (VideoCardDto myObject : myObjects) {
            if (myObject.getGuid().equals(guid)) {
                videoCardDto = myObject;
                return ResponseEntity.ok(videoCardDto);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
