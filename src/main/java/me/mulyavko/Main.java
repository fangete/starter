package me.mulyavko;

import me.mulyavko.bot.TelegramBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        TelegramBotsApi telegramBotsApi = null;
        try {
            telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new TelegramBot("5901000381:AAHc0t_L-JRzjvW7eVEc-WfQMk2AErrPhq8"));
        } catch (TelegramApiException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
