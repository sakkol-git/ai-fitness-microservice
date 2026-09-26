package com.ai.fitness.user_service.mapper;

import com.ai.fitness.user_service.dto.UserRequest;
import com.ai.fitness.user_service.dto.UserRespond;
import com.ai.fitness.user_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserRequest request);

    UserRespond toUserResponse(User user);
}
