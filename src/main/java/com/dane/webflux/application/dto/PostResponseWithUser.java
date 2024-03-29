package com.dane.webflux.application.dto;

import com.dane.webflux.domain.post.Post;

import java.time.LocalDateTime;

public record PostResponseWithUser(Long id, String title, String content, LocalDateTime createdAt,
                                   Long authorId, String authorName, Integer authorAge) {
    public static PostResponseWithUser from(Post post) {
        return new PostResponseWithUser(post.getId(),
                post.getTitle(),
                post.getContent(),
                post.getCreatedAt(),
                post.getAuthor().getId(),
                post.getAuthor().getName(),
                post.getAuthor().getAge());
    }
}
