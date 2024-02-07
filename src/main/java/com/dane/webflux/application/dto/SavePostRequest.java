package com.dane.webflux.application.dto;

import com.dane.webflux.domain.post.Post;

public record SavePostRequest(Long authorId, String title, String content) {

    public Post toEntity() {
        return new Post(title, content, authorId);
    }

}
