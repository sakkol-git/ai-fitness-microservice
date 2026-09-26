package com.ai.fitness.activity_service.controller;

import com.ai.fitness.activity_service.dto.ActivityRequest;
import com.ai.fitness.activity_service.dto.ActivityResponse;
import com.ai.fitness.activity_service.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
@RequiredArgsConstructor
public class ActivityController {
    private final ActivityService activityService;
    @GetMapping
    public ResponseEntity<List<ActivityResponse>> getActivities() {
        return ResponseEntity.ok(activityService.getActivities());
    }
    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest request){
        return ResponseEntity.ok(activityService.trackActivity(request));
    }
}
