package com.dane.webflux.domain.post;

import reactor.core.publisher.Flux;

public interface PostCustomRepository {

    Flux<Post> searchByKeyword(String keyword);

    Flux<PostUserSpecificInfo> findAllWithAuthor();

}
