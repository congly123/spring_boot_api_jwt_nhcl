package com.example.spring_boot_api_jwt_nhcl.service;

import com.example.spring_boot_api_jwt_nhcl.entity.User;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;

public interface UserService {
    public Boolean saveAndFlush(User user);
    public User getUser(String name);
}
