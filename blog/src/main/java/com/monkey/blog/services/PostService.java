package com.monkey.blog.services;

import com.monkey.blog.domain.entity.Post;
import com.monkey.blog.domain.entity.User;

import java.util.List;
import java.util.UUID;

public interface PostService {
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
    List<Post> getDraftPosts(User user);
}
