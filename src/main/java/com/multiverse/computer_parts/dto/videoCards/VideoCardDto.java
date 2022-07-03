package com.multiverse.computer_parts.dto.videoCards;

public class VideoCardDto {
    private String guid;
    private String type;
    private String name;

    public VideoCardDto() {
    }

    public VideoCardDto(String guid, String type, String name) {
        this.guid = guid;
        this.type = type;
        this.name = name;
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
}
