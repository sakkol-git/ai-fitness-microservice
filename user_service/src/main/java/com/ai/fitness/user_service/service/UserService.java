package com.ai.fitness.user_service.service;

import com.ai.fitness.user_service.dto.UserRequest;
import com.ai.fitness.user_service.dto.UserRespond;
import com.ai.fitness.user_service.entity.User;
import com.ai.fitness.user_service.exception.UserAlreadyExistException;
import com.ai.fitness.user_service.exception.UserNotFoundException;
import com.ai.fitness.user_service.mapper.UserMapper;
import com.ai.fitness.user_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserRespond getUserProfile(UUID userId) {
        User user = userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException(userId));
        return userMapper.toUserResponse(user);
    }

    public UserRespond createUser(UserRequest request) {
        if (userRepository.existsByEmail(request.email())){
            throw new UserAlreadyExistException(request.email());
        }
        User user = userMapper.toUser(request);
        userRepository.save(user);
        return userMapper.toUserResponse(user);
    }
}
