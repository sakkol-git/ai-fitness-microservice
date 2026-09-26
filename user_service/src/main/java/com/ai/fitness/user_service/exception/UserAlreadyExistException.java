package com.ai.fitness.user_service.exception;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String email) {
        super("User with email: " + email + " already exists");
    }
}
