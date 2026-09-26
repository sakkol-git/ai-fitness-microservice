package com.ai.fitness.activity_service.dto;

import com.ai.fitness.activity_service.entity.enums.ActivityType;

import java.time.LocalDateTime;
import java.util.Map;

public record ActivityResponse(
        String id,
        String userId,
        ActivityType type,
        Integer duration,
        Integer caloriesBurned,
        LocalDateTime startTime,
        Map<String, Object> additionalProperties,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}