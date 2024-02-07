package com.dane.webflux.application;

import com.dane.webflux.domain.post.PostRepository;
import com.dane.webflux.application.dto.PostResponse;
import com.dane.webflux.application.dto.SavePostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Flux<PostResponse> getAll() {
        return postRepository.findAll()
                       .map(PostResponse::from);
    }

    public Mono<PostResponse> getOne(Long postId) {
        return postRepository.findById(postId)
                       .map(PostResponse::from);
    }

    @Transactional
    public Mono<Void> save(SavePostRequest request) {
        return postRepository.save(request.toEntity())
                       .then();
    }

}
