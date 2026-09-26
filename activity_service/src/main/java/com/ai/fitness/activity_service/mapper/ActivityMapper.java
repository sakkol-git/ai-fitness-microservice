package com.ai.fitness.activity_service.mapper;

import com.ai.fitness.activity_service.dto.ActivityRequest;
import com.ai.fitness.activity_service.dto.ActivityResponse;
import com.ai.fitness.activity_service.entity.Activity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActivityMapper {
    Activity toActivity(ActivityRequest request);
    ActivityResponse toActivityResponse(Activity activity);
}
