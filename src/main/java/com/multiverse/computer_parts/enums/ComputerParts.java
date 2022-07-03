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
    },
    PROCESSORS {
        public String json() {
            String jsonProcessors = "";
            FileResourcesUtils app = new FileResourcesUtils();
            String fileName = "static/json/computerParts/processors/processors.json";
            jsonProcessors = app.getFileFromResource(fileName);
            return jsonProcessors;
        }
    },
    MEMORY {
        public String json() {
            String jsonMemory = "";
            FileResourcesUtils app = new FileResourcesUtils();
            String fileName = "static/json/computerParts/memory/memory.json";
            jsonMemory = app.getFileFromResource(fileName);
            return jsonMemory;
        }
    };

    public abstract String json();
}
