package com.kgc.mapper;

import com.kgc.entity.User;

import java.util.List;

public interface UserMapper {
    public List<User> findAll();
    public User findById();
}
