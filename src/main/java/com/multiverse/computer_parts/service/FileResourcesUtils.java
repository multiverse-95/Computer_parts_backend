package com.multiverse.computer_parts.service;

//region Imports

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
//endregion

//region class FileResourcesUtils

/**
 * Класс по обработке файлов из ресурсов
 */
public class FileResourcesUtils {

    //region Public methods

    /**
     * Выводит поток байтов на экран
     *
     * @param is Поток байтов
     */
    public static void printInputStream(InputStream is) {

        try (InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8); BufferedReader reader = new BufferedReader(streamReader)) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Выводит файл на экран
     *
     * @param file Файл
     */
    public static void printFile(File file) {

        List<String> lines;
        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Получение файла с папки ресурсов. Работает везде, как в jar так и в war файлах
     *
     * @param fileName Относительный путь к файлу
     * @return поток байтов inputStream
     */
    public InputStream getFileFromResourceAsStream(String fileName) {

        // Получаем classloader, inputStream получаем как поток из ресурсов
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // Проверяем поток на null
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }

    }

    /**
     * Получает файл ресурсов, обрабатывает поток
     *
     * @param fileName Относительный путь к файлу
     * @return строка json
     */
    public String getFileFromResource(String fileName) {
        String json = "";
        System.out.println("getResourceAsStream : " + fileName);

        InputStream is = getFileFromResourceAsStream(fileName);

        // Преобразуем поток InputStream, в String
        BufferedInputStream bis = new BufferedInputStream(is);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();

        try {
            for (int result = bis.read(); result != -1; result = bis.read()) {
                buf.write((byte) result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        json = buf.toString(StandardCharsets.UTF_8);
        return json;
    }
    //endregion

}


