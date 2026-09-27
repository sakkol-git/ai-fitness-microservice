package com.ai.fitness.activity_service.service;

import com.ai.fitness.activity_service.dto.ActivityRequest;
import com.ai.fitness.activity_service.dto.ActivityResponse;
import com.ai.fitness.activity_service.entity.Activity;
import com.ai.fitness.activity_service.mapper.ActivityMapper;
import com.ai.fitness.activity_service.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final ActivityMapper activityMapper;
    private final ActivityRepository activityRepository;
    public ActivityResponse getActivityById(String activityId) {
        var activity = activityRepository.findById(activityId).orElseThrow();
        return activityMapper.toActivityResponse(activity);
    };

    public ActivityResponse trackActivity(ActivityRequest request) {
        Activity activity = activityRepository.save(activityMapper.toActivity(request));
        return activityMapper.toActivityResponse(activity);
    }

    public List<ActivityResponse> getUserActivities(String userId) {
        var userActivities = activityRepository.findByUserId(userId);
        return userActivities.stream().map(activityMapper::toActivityResponse).toList();
    }
}
