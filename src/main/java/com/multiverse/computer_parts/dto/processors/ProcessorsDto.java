package com.multiverse.computer_parts.dto.processors;

import com.multiverse.computer_parts.dto.videoCards.DetailsVideoCardDto;

public class ProcessorsDto {
    private String guid;
    private String type;
    private String name;
    private DetailsProcessorsDto details;

    public ProcessorsDto() {
    }

    public ProcessorsDto(String guid, String type, String name, DetailsProcessorsDto details) {
        this.guid = guid;
        this.type = type;
        this.name = name;
        this.details = details;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DetailsProcessorsDto getDetails() {
        return details;
    }

    public void setDetails(DetailsProcessorsDto details) {
        this.details = details;
    }
}
