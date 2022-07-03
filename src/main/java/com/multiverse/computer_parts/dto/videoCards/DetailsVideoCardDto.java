/*
 * Copyright (c) 2022.
 * This code was originally developed 03.07.2022, 20:31 by Valkov V.V.
 */

package com.multiverse.computer_parts.dto.videoCards;

public class DetailsVideoCardDto {
    private String fullName;
    private String manufacturer;
    private String videoMemorySize;
    private String busBitWidth;

    public DetailsVideoCardDto() {
    }

    public DetailsVideoCardDto(String fullName, String manufacturer, String videoMemorySize, String busBitWidth) {
        this.fullName = fullName;
        this.manufacturer = manufacturer;
        this.videoMemorySize = videoMemorySize;
        this.busBitWidth = busBitWidth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVideoMemorySize() {
        return videoMemorySize;
    }

    public void setVideoMemorySize(String videoMemorySize) {
        this.videoMemorySize = videoMemorySize;
    }

    public String getBusBitWidth() {
        return busBitWidth;
    }

    public void setBusBitWidth(String busBitWidth) {
        this.busBitWidth = busBitWidth;
    }
}


