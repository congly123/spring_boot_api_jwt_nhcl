package com.example.spring_boot_api_jwt_nhcl.repository;

import com.example.spring_boot_api_jwt_nhcl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReponsitory extends JpaRepository<User, Long> {
    public User findByUsername(String name);
}
