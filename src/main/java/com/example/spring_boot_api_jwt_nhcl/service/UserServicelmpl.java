package com.example.spring_boot_api_jwt_nhcl.service;

import com.example.spring_boot_api_jwt_nhcl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.spring_boot_api_jwt_nhcl.repository.UserReponsitory;
@Service
public class UserServicelmpl implements UserService {

    @Autowired
    private UserReponsitory userReponsitory;


    @Override
    public Boolean saveAndFlush(User user) {
        if(user !=null)
        {
            userReponsitory.saveAndFlush(user);
            return true;
        }
        return false;
    }

    @Override
    public User getUser(String name) {
        return userReponsitory.findByUsername(name);
    }
}