package com.multiverse.computer_parts.dto.videoCards;

import java.util.List;

public class VideoCardDto {
    private String guid;
    private String type;
    private String name;
    private DetailsVideoCardDto details;

    public VideoCardDto() {
    }

    public VideoCardDto(String guid, String type, String name, DetailsVideoCardDto details) {
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

    public DetailsVideoCardDto getDetails() {
        return details;
    }

    public void setDetails(DetailsVideoCardDto details) {
        this.details = details;
    }
}
