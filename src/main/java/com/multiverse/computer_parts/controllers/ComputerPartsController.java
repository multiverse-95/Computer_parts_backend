package com.multiverse.computer_parts.controllers;

import org.hibernate.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parts")
public class ComputerPartsController {

    @GetMapping("/videocards/product/{guid}")
    public String getVideoCard(@PathVariable String guid){
       return "test";
    }

}
