package com.chatbot.chatbotserver.service;

import org.springframework.stereotype.Service;

import com.chatbot.chatbotserver.model.ChatbotRequest;
import com.chatbot.chatbotserver.model.ChatbotResponse;

@Service
public class ChatbotServerService {
    public ChatbotResponse getChatbotResponse(ChatbotRequest request){
        ChatbotResponse chatbotResponse = new ChatbotResponse();
        chatbotResponse.setResponse("chegou aqui");
        return chatbotResponse;
        //call the bot
        //return response
    }
}
