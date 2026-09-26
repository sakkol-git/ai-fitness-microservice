package com.ai.fitness.user_service.exception;

import org.springframework.stereotype.Component;

import java.util.UUID;

public class UserNotFoundException extends RuntimeException{
    private UUID userId;
    public UserNotFoundException( UUID userId) {
        super("User with id: " + userId + " not found");
    }
}
