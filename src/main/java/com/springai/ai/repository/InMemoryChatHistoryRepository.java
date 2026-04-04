package com.springai.ai.repository;



import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Slf4j
@Component
@RequiredArgsConstructor
public class InMemoryChatHistoryRepository implements ChatHistoryRepository {

    private final Map<String, List<String>> chatHistory = new HashMap<>();

//    private final ChatMemory chatMemory;

    /**
     * 保存会话记录
     */
    @Override
    public void save(String type, String chatId) {
        List<String> chatIds = chatHistory.computeIfAbsent(type, k -> new ArrayList<>());
        if (chatIds.contains(chatId)) {
            return;
        }
        chatIds.add(chatId);
    }

    /**
     * 获取会话ID列表
     */
    @Override
    public List<String> getChatIds(String type) {
        return chatHistory.getOrDefault(type, List.of());
    }

}
