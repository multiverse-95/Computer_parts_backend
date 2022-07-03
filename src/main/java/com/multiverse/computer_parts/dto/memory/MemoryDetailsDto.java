package com.multiverse.computer_parts.dto.memory;

public class MemoryDetailsDto {
    private String fullName;
    private String valueMemory;

    public MemoryDetailsDto() {
    }

    public MemoryDetailsDto(String fullName, String valueMemory) {
        this.fullName = fullName;
        this.valueMemory = valueMemory;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getValueMemory() {
        return valueMemory;
    }

    public void setValueMemory(String valueMemory) {
        this.valueMemory = valueMemory;
    }
}
