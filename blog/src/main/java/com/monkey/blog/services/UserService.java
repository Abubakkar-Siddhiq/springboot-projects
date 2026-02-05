package com.monkey.blog.services;

import com.monkey.blog.domain.entity.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
