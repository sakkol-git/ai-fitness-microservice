package com.ai.fitness.activity_service.repository;

import com.ai.fitness.activity_service.entity.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ActivityRepository extends MongoRepository<Activity,String> {
    List<Activity> findByUserId(String userId);

    Optional<Activity> findById(UUID activityId);
}
