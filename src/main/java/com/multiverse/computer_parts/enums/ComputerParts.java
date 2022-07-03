package com.multiverse.computer_parts.enums;

import com.multiverse.computer_parts.service.FileResourcesUtils;

public enum ComputerParts {

    VIDEO_CARDS {
        public String json() {
            String jsonVideoCards = "";
            FileResourcesUtils app = new FileResourcesUtils();
            String fileName = "static/json/computerParts/videoCards/videoCards.json";
            jsonVideoCards = app.getFileFromResource(fileName);
            return jsonVideoCards;
        }
    };

    public abstract String json();
}
