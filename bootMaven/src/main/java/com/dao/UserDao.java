package com.dao;

import com.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
}
