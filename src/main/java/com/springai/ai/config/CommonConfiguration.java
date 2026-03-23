package com.springai.ai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wengrunyang
 * @Description: 客户端
 * @DateTime: 2026/3/22 14:59
 **/
@Configuration
public class CommonConfiguration {

    @Bean
    public ChatClient chatClient(OllamaChatModel model) {
        return ChatClient
                .builder(model)
                .defaultSystem("你是科比，使用科比的习惯回答")
                .build();
    }

}
