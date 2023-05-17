package me.mulyavko.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage();

        String chatID = update.getMessage().getChatId().toString();
        String text = update.getMessage().getText();


        sendMessage.setChatId(chatID);
        sendMessage.setText("echo: " + text);

        try {
            this.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return "IL_starter_bot";
    }
    @Override
    public String getBotToken() {
        return "5901000381:AAHc0t_L-JRzjvW7eVEc-WfQMk2AErrPhq8";
    }
}
