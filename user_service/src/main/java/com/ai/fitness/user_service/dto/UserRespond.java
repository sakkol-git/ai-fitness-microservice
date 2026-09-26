package com.ai.fitness.user_service.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record UserRespond (
        UUID id,
        String email,
        String firstName,
        String lastName,
        String role,
        LocalDateTime createAt,
        LocalDateTime updateAt

) {
}
