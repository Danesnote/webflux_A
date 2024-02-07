package com.dane.webflux.application.dto;

import com.dane.webflux.domain.post.Post;

import java.time.LocalDateTime;

public record PostResponse(Long id, String title, String content,
                           LocalDateTime createdAt, LocalDateTime updatedAt) {
    public static PostResponse from(Post post) {
        return new PostResponse(post.getId(),
                post.getTitle(),
                post.getContent(),
                post.getCreatedAt(),
                post.getUpdatedAt());
    }
}
