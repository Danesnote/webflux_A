package com.dane.webflux.application;

import com.dane.webflux.application.dto.UserResponse;
import com.dane.webflux.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Mono<List<UserResponse>> getAll() {
        return userRepository.findAllWithPosts()
                       .map(UserResponse::from)
                       .collectList();
    }

}
