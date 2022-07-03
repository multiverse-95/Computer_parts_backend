package com.multiverse.computer_parts.dto.memory;

import com.multiverse.computer_parts.dto.videoCards.DetailsVideoCardDto;

public class MemoryDto {
    private String guid;
    private String type;
    private String name;
    private MemoryDetailsDto details;

    public MemoryDto() {
    }

    public MemoryDto(String guid, String type, String name, MemoryDetailsDto details) {
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

    public MemoryDetailsDto getDetails() {
        return details;
    }

    public void setDetails(MemoryDetailsDto details) {
        this.details = details;
    }
}
