package com.example.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogUtil {
    private static final Logger logger = Logger.getLogger("AppLog");
    private static FileHandler fileHandler;

    static {
        try {
            // Настройка обработчика файла
            fileHandler = new FileHandler("C:/Users/admin/IdeaProjects/untitled7/logs/application_logs.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для логирования обычных сообщений
    public static void log(String message) {
        System.out.println("Logging message: " + message); // Отладочный вывод
        logger.info(message);
    }

    // Метод для логирования ошибок
    public static void logError(String message, Exception e) {
        System.err.println("Logging error: " + message); // Отладочный вывод в консоль
        logger.severe(message + " - Exception: " + e.getMessage());
        e.printStackTrace(); // Для вывода полного стека ошибок в консоль
    }
}