package com.chatbot.chatbotserver.service;

import org.springframework.stereotype.Service;

import com.chatbot.chatbotserver.chatbot.Chatbot;
import com.chatbot.chatbotserver.model.ChatbotRequest;
import com.chatbot.chatbotserver.model.ChatbotResponse;

@Service
public class ChatbotServerService {

    private Chatbot chatbot;

    ChatbotServerService() {
        chatbot = new Chatbot();
        chatbot.start();
    }

    public ChatbotResponse getChatbotResponse(ChatbotRequest request){
        ChatbotResponse chatbotResponse = new ChatbotResponse();
        String response = chatbot.processMessage(request.getRequest());
        chatbotResponse.setResponse(response);
        return chatbotResponse;
    }
}
