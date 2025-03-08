package com.spring;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

	 @MessageMapping("/sendMessage")
	    @SendTo("/topic/messages")
	    public ChatMessage sendMessage(ChatMessage message) {
	        message.setTimestamp(new SimpleDateFormat("HH:mm:ss").format(new Date()));
	        return message;
	    }
}
