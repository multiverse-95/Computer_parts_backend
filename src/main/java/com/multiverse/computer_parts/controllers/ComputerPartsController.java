package com.multiverse.computer_parts.controllers;

import com.multiverse.computer_parts.dto.videoCards.VideoCardDto;
import com.multiverse.computer_parts.enums.ComputerParts;
import com.multiverse.computer_parts.service.FileResourcesUtils;
import com.multiverse.computer_parts.service.SerializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/parts")
public class ComputerPartsController {
    @Autowired
    SerializationService serializationService;

    @GetMapping("/videocards/list")
    public ResponseEntity<Object> getVideoCards(){
        VideoCardDto[]  videoCardDtoList= null;
        ComputerParts computerPartsEnums = ComputerParts.VIDEO_CARDS;
        String jsonVideoCards = computerPartsEnums.json();
        videoCardDtoList = serializationService.serializeVideoCards(jsonVideoCards);
        return ResponseEntity.ok(videoCardDtoList);
    }

}
