package com.multiverse.computer_parts.service;

//region class SerializationService

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.multiverse.computer_parts.dto.videoCards.VideoCardDto;
import org.springframework.stereotype.Service;

/**
 * Класс для сериализации строки json в json
 */
@Service
public class SerializationService {

    //region Variables
    private final ObjectMapper objectMapper;
    private VideoCardDto[] videoCardArray;
    //endregion

    //region Constructors

    /**
     * Конструктор по-умолчанию
     */
    public SerializationService() {
        objectMapper = new ObjectMapper();
    }
    //endregion
    //region Public methods

    /**
     * Сериализация json строка по видеокартам
     *
     * @param json строка json в несериализованном виде
     * @return json сериализованный
     */
    public VideoCardDto[] serializeVideoCards(String json) {
        try {
            videoCardArray = objectMapper.readValue(json, VideoCardDto[].class);
        } catch (JsonProcessingException jsonProcessingException) {
            jsonProcessingException.printStackTrace();
        }
        return videoCardArray;
    }

    //endregion
}
//endregion
