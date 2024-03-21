package com.chatbot.chatbotserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatbot.chatbotserver.model.ChatbotRequest;
import com.chatbot.chatbotserver.model.ChatbotResponse;
import com.chatbot.chatbotserver.service.ChatbotServerService;

@RestController
@RequestMapping("/chatbot")
public class ChatbotServerController {
    @Autowired
    ChatbotServerService service;
    
    @GetMapping
    public ChatbotResponse getChatbotResponse(@RequestBody ChatbotRequest request){  
        return service.getChatbotResponse(request);
    }
}
