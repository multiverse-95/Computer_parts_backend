package com.multiverse.computer_parts.dto.processors;

public class DetailsProcessorsDto {
    private String fullName;
    private String manufacturer;
    private String clockFrequency;

    public DetailsProcessorsDto() {
    }

    public DetailsProcessorsDto(String fullName, String manufacturer, String clockFrequency) {
        this.fullName = fullName;
        this.manufacturer = manufacturer;
        this.clockFrequency = clockFrequency;
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

    public String getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(String clockFrequency) {
        this.clockFrequency = clockFrequency;
    }
}
