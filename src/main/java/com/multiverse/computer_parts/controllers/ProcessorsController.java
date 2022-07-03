/*
 * Copyright (c) 2022.
 * This code was originally developed 03.07.2022, 20:25 by Valkov V.V.
 */

package com.multiverse.computer_parts.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.multiverse.computer_parts.dto.processors.ProcessorsDto;
import com.multiverse.computer_parts.dto.videoCards.VideoCardDto;
import com.multiverse.computer_parts.enums.ComputerParts;
import com.multiverse.computer_parts.service.SerializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/processors")
public class ProcessorsController {
    @Autowired
    SerializationService serializationService;

    @GetMapping("/list")
    public ResponseEntity<Object> getProcessors() {
        ProcessorsDto[] processorsDtoList = null;
        ComputerParts computerPartsEnums = ComputerParts.PROCESSORS;
        String jsonProcessors = computerPartsEnums.json();
        processorsDtoList = serializationService.serializeProcessors(jsonProcessors);
        return ResponseEntity.ok(processorsDtoList);
    }

    @GetMapping("/product/{guid}")
    public ResponseEntity<Object> getVideoCardById(@PathVariable String guid) throws JsonProcessingException {
        ProcessorsDto processorsDto = new ProcessorsDto();
        ComputerParts computerPartsEnums = ComputerParts.PROCESSORS;
        String jsonProcessors = computerPartsEnums.json();
        ObjectMapper objectMapper = new ObjectMapper();
        List<ProcessorsDto> myObjects = objectMapper.readValue(jsonProcessors, new TypeReference<List<ProcessorsDto>>(){});
        for (ProcessorsDto myObject : myObjects) {
            if (myObject.getGuid().equals(guid)) {
                processorsDto = myObject;
                return ResponseEntity.ok(processorsDto);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
